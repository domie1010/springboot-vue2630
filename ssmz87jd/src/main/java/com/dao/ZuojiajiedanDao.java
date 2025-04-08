package com.dao;

import com.entity.ZuojiajiedanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuojiajiedanVO;
import com.entity.view.ZuojiajiedanView;


/**
 * 作家接单
 * 
 * @author 
 * @email 
 * @date 2021-05-30 19:40:35
 */
public interface ZuojiajiedanDao extends BaseMapper<ZuojiajiedanEntity> {
	
	List<ZuojiajiedanVO> selectListVO(@Param("ew") Wrapper<ZuojiajiedanEntity> wrapper);
	
	ZuojiajiedanVO selectVO(@Param("ew") Wrapper<ZuojiajiedanEntity> wrapper);
	
	List<ZuojiajiedanView> selectListView(@Param("ew") Wrapper<ZuojiajiedanEntity> wrapper);

	List<ZuojiajiedanView> selectListView(Pagination page,@Param("ew") Wrapper<ZuojiajiedanEntity> wrapper);
	
	ZuojiajiedanView selectView(@Param("ew") Wrapper<ZuojiajiedanEntity> wrapper);
	
}
