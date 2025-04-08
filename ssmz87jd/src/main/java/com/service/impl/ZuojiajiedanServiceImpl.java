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


import com.dao.ZuojiajiedanDao;
import com.entity.ZuojiajiedanEntity;
import com.service.ZuojiajiedanService;
import com.entity.vo.ZuojiajiedanVO;
import com.entity.view.ZuojiajiedanView;

@Service("zuojiajiedanService")
public class ZuojiajiedanServiceImpl extends ServiceImpl<ZuojiajiedanDao, ZuojiajiedanEntity> implements ZuojiajiedanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuojiajiedanEntity> page = this.selectPage(
                new Query<ZuojiajiedanEntity>(params).getPage(),
                new EntityWrapper<ZuojiajiedanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuojiajiedanEntity> wrapper) {
		  Page<ZuojiajiedanView> page =new Query<ZuojiajiedanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuojiajiedanVO> selectListVO(Wrapper<ZuojiajiedanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuojiajiedanVO selectVO(Wrapper<ZuojiajiedanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuojiajiedanView> selectListView(Wrapper<ZuojiajiedanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuojiajiedanView selectView(Wrapper<ZuojiajiedanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
