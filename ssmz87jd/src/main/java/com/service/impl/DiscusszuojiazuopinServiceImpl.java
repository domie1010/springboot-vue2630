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


import com.dao.DiscusszuojiazuopinDao;
import com.entity.DiscusszuojiazuopinEntity;
import com.service.DiscusszuojiazuopinService;
import com.entity.vo.DiscusszuojiazuopinVO;
import com.entity.view.DiscusszuojiazuopinView;

@Service("discusszuojiazuopinService")
public class DiscusszuojiazuopinServiceImpl extends ServiceImpl<DiscusszuojiazuopinDao, DiscusszuojiazuopinEntity> implements DiscusszuojiazuopinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszuojiazuopinEntity> page = this.selectPage(
                new Query<DiscusszuojiazuopinEntity>(params).getPage(),
                new EntityWrapper<DiscusszuojiazuopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszuojiazuopinEntity> wrapper) {
		  Page<DiscusszuojiazuopinView> page =new Query<DiscusszuojiazuopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszuojiazuopinVO> selectListVO(Wrapper<DiscusszuojiazuopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszuojiazuopinVO selectVO(Wrapper<DiscusszuojiazuopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszuojiazuopinView> selectListView(Wrapper<DiscusszuojiazuopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszuojiazuopinView selectView(Wrapper<DiscusszuojiazuopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
