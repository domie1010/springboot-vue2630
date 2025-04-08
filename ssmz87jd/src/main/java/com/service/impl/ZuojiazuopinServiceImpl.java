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


import com.dao.ZuojiazuopinDao;
import com.entity.ZuojiazuopinEntity;
import com.service.ZuojiazuopinService;
import com.entity.vo.ZuojiazuopinVO;
import com.entity.view.ZuojiazuopinView;

@Service("zuojiazuopinService")
public class ZuojiazuopinServiceImpl extends ServiceImpl<ZuojiazuopinDao, ZuojiazuopinEntity> implements ZuojiazuopinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuojiazuopinEntity> page = this.selectPage(
                new Query<ZuojiazuopinEntity>(params).getPage(),
                new EntityWrapper<ZuojiazuopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuojiazuopinEntity> wrapper) {
		  Page<ZuojiazuopinView> page =new Query<ZuojiazuopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuojiazuopinVO> selectListVO(Wrapper<ZuojiazuopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuojiazuopinVO selectVO(Wrapper<ZuojiazuopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuojiazuopinView> selectListView(Wrapper<ZuojiazuopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuojiazuopinView selectView(Wrapper<ZuojiazuopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
