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


import com.dao.ZuojiaDao;
import com.entity.ZuojiaEntity;
import com.service.ZuojiaService;
import com.entity.vo.ZuojiaVO;
import com.entity.view.ZuojiaView;

@Service("zuojiaService")
public class ZuojiaServiceImpl extends ServiceImpl<ZuojiaDao, ZuojiaEntity> implements ZuojiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuojiaEntity> page = this.selectPage(
                new Query<ZuojiaEntity>(params).getPage(),
                new EntityWrapper<ZuojiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuojiaEntity> wrapper) {
		  Page<ZuojiaView> page =new Query<ZuojiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuojiaVO> selectListVO(Wrapper<ZuojiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuojiaVO selectVO(Wrapper<ZuojiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuojiaView> selectListView(Wrapper<ZuojiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuojiaView selectView(Wrapper<ZuojiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
