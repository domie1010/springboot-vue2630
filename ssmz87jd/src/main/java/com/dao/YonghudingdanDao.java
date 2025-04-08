package com.dao;

import com.entity.YonghudingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghudingdanVO;
import com.entity.view.YonghudingdanView;


/**
 * 用户订单
 * 
 * @author 
 * @email 
 * @date 2021-05-30 19:40:35
 */
public interface YonghudingdanDao extends BaseMapper<YonghudingdanEntity> {
	
	List<YonghudingdanVO> selectListVO(@Param("ew") Wrapper<YonghudingdanEntity> wrapper);
	
	YonghudingdanVO selectVO(@Param("ew") Wrapper<YonghudingdanEntity> wrapper);
	
	List<YonghudingdanView> selectListView(@Param("ew") Wrapper<YonghudingdanEntity> wrapper);

	List<YonghudingdanView> selectListView(Pagination page,@Param("ew") Wrapper<YonghudingdanEntity> wrapper);
	
	YonghudingdanView selectView(@Param("ew") Wrapper<YonghudingdanEntity> wrapper);
	
}
