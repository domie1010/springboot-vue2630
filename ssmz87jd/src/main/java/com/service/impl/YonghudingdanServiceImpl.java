package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YonghudingdanDao;
import com.entity.YonghudingdanEntity;
import com.service.YonghudingdanService;
import com.entity.vo.YonghudingdanVO;
import com.entity.view.YonghudingdanView;

@Service("yonghudingdanService")
public class YonghudingdanServiceImpl extends ServiceImpl<YonghudingdanDao, YonghudingdanEntity> implements YonghudingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghudingdanEntity> page = this.selectPage(
                new Query<YonghudingdanEntity>(params).getPage(),
                new EntityWrapper<YonghudingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghudingdanEntity> wrapper) {
		  Page<YonghudingdanView> page =new Query<YonghudingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghudingdanVO> selectListVO(Wrapper<YonghudingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghudingdanVO selectVO(Wrapper<YonghudingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghudingdanView> selectListView(Wrapper<YonghudingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghudingdanView selectView(Wrapper<YonghudingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
