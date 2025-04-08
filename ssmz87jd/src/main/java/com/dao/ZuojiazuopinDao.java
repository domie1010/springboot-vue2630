package com.dao;

import com.entity.ZuojiazuopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuojiazuopinVO;
import com.entity.view.ZuojiazuopinView;


/**
 * 作家作品
 * 
 * @author 
 * @email 
 * @date 2021-05-30 19:40:34
 */
public interface ZuojiazuopinDao extends BaseMapper<ZuojiazuopinEntity> {
	
	List<ZuojiazuopinVO> selectListVO(@Param("ew") Wrapper<ZuojiazuopinEntity> wrapper);
	
	ZuojiazuopinVO selectVO(@Param("ew") Wrapper<ZuojiazuopinEntity> wrapper);
	
	List<ZuojiazuopinView> selectListView(@Param("ew") Wrapper<ZuojiazuopinEntity> wrapper);

	List<ZuojiazuopinView> selectListView(Pagination page,@Param("ew") Wrapper<ZuojiazuopinEntity> wrapper);
	
	ZuojiazuopinView selectView(@Param("ew") Wrapper<ZuojiazuopinEntity> wrapper);
	
}
