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

import com.entity.ZuojiajiedanEntity;
import com.entity.view.ZuojiajiedanView;

import com.service.ZuojiajiedanService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 作家接单
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-30 19:40:35
 */
@RestController
@RequestMapping("/zuojiajiedan")
public class ZuojiajiedanController {
    @Autowired
    private ZuojiajiedanService zuojiajiedanService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZuojiajiedanEntity zuojiajiedan, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			zuojiajiedan.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zuojia")) {
			zuojiajiedan.setZuojiazhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZuojiajiedanEntity> ew = new EntityWrapper<ZuojiajiedanEntity>();
		PageUtils page = zuojiajiedanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuojiajiedan), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZuojiajiedanEntity zuojiajiedan, 
		HttpServletRequest request){
        EntityWrapper<ZuojiajiedanEntity> ew = new EntityWrapper<ZuojiajiedanEntity>();
		PageUtils page = zuojiajiedanService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zuojiajiedan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZuojiajiedanEntity zuojiajiedan){
       	EntityWrapper<ZuojiajiedanEntity> ew = new EntityWrapper<ZuojiajiedanEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zuojiajiedan, "zuojiajiedan")); 
        return R.ok().put("data", zuojiajiedanService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZuojiajiedanEntity zuojiajiedan){
        EntityWrapper< ZuojiajiedanEntity> ew = new EntityWrapper< ZuojiajiedanEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zuojiajiedan, "zuojiajiedan")); 
		ZuojiajiedanView zuojiajiedanView =  zuojiajiedanService.selectView(ew);
		return R.ok("查询作家接单成功").put("data", zuojiajiedanView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZuojiajiedanEntity zuojiajiedan = zuojiajiedanService.selectById(id);
        return R.ok().put("data", zuojiajiedan);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZuojiajiedanEntity zuojiajiedan = zuojiajiedanService.selectById(id);
        return R.ok().put("data", zuojiajiedan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZuojiajiedanEntity zuojiajiedan, HttpServletRequest request){
    	zuojiajiedan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuojiajiedan);

        zuojiajiedanService.insert(zuojiajiedan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZuojiajiedanEntity zuojiajiedan, HttpServletRequest request){
    	zuojiajiedan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zuojiajiedan);

        zuojiajiedanService.insert(zuojiajiedan);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZuojiajiedanEntity zuojiajiedan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zuojiajiedan);
        zuojiajiedanService.updateById(zuojiajiedan);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zuojiajiedanService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ZuojiajiedanEntity> wrapper = new EntityWrapper<ZuojiajiedanEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zuojia")) {
			wrapper.eq("zuojiazhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zuojiajiedanService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
