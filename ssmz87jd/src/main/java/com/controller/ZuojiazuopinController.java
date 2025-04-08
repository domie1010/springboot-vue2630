package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZuojiazuopinEntity;
import com.entity.view.ZuojiazuopinView;

import com.service.ZuojiazuopinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 作家作品
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-30 19:40:34
 */
@RestController
@RequestMapping("/zuojiazuopin")
public class ZuojiazuopinController {
    @Autowired
    private ZuojiazuopinService zuojiazuopinService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZuojiazuopinEntity zuojiazuopin, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zuojia")) {
			zuojiazuopin.setZuojiazhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZuojiazuopinEntity> ew = new EntityWrapper<ZuojiazuopinEntity>();
		PageUtils page = zuojiazuopinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuojiazuopin), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZuojiazuopinEntity zuojiazuopin, 
		HttpServletRequest request){
        EntityWrapper<ZuojiazuopinEntity> ew = new EntityWrapper<ZuojiazuopinEntity>();
		PageUtils page = zuojiazuopinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuojiazuopin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZuojiazuopinEntity zuojiazuopin){
       	EntityWrapper<ZuojiazuopinEntity> ew = new EntityWrapper<ZuojiazuopinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zuojiazuopin, "zuojiazuopin")); 
        return R.ok().put("data", zuojiazuopinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZuojiazuopinEntity zuojiazuopin){
        EntityWrapper< ZuojiazuopinEntity> ew = new EntityWrapper< ZuojiazuopinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zuojiazuopin, "zuojiazuopin")); 
		ZuojiazuopinView zuojiazuopinView =  zuojiazuopinService.selectView(ew);
		return R.ok("查询作家作品成功").put("data", zuojiazuopinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZuojiazuopinEntity zuojiazuopin = zuojiazuopinService.selectById(id);
		zuojiazuopin.setClicknum(zuojiazuopin.getClicknum()+1);
		zuojiazuopin.setClicktime(new Date());
		zuojiazuopinService.updateById(zuojiazuopin);
        return R.ok().put("data", zuojiazuopin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZuojiazuopinEntity zuojiazuopin = zuojiazuopinService.selectById(id);
		zuojiazuopin.setClicknum(zuojiazuopin.getClicknum()+1);
		zuojiazuopin.setClicktime(new Date());
		zuojiazuopinService.updateById(zuojiazuopin);
        return R.ok().put("data", zuojiazuopin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZuojiazuopinEntity zuojiazuopin, HttpServletRequest request){
    	zuojiazuopin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuojiazuopin);

        zuojiazuopinService.insert(zuojiazuopin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZuojiazuopinEntity zuojiazuopin, HttpServletRequest request){
    	zuojiazuopin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuojiazuopin);

        zuojiazuopinService.insert(zuojiazuopin);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZuojiazuopinEntity zuojiazuopin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zuojiazuopin);
        zuojiazuopinService.updateById(zuojiazuopin);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zuojiazuopinService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZuojiazuopinEntity> wrapper = new EntityWrapper<ZuojiazuopinEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("zuojia")) {
			wrapper.eq("zuojiazhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zuojiazuopinService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,ZuojiazuopinEntity zuojiazuopin, HttpServletRequest request,String pre){
        EntityWrapper<ZuojiazuopinEntity> ew = new EntityWrapper<ZuojiazuopinEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = zuojiazuopinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuojiazuopin), params), params));
        return R.ok().put("data", page);
    }


}
