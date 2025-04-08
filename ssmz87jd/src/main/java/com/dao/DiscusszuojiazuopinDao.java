package com.dao;

import com.entity.DiscusszuojiazuopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszuojiazuopinVO;
import com.entity.view.DiscusszuojiazuopinView;


/**
 * 作家作品评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-30 19:40:35
 */
public interface DiscusszuojiazuopinDao extends BaseMapper<DiscusszuojiazuopinEntity> {
	
	List<DiscusszuojiazuopinVO> selectListVO(@Param("ew") Wrapper<DiscusszuojiazuopinEntity> wrapper);
	
	DiscusszuojiazuopinVO selectVO(@Param("ew") Wrapper<DiscusszuojiazuopinEntity> wrapper);
	
	List<DiscusszuojiazuopinView> selectListView(@Param("ew") Wrapper<DiscusszuojiazuopinEntity> wrapper);

	List<DiscusszuojiazuopinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszuojiazuopinEntity> wrapper);
	
	DiscusszuojiazuopinView selectView(@Param("ew") Wrapper<DiscusszuojiazuopinEntity> wrapper);
	
}
