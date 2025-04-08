package com.dao;

import com.entity.ZuojiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuojiaVO;
import com.entity.view.ZuojiaView;


/**
 * 作家
 * 
 * @author 
 * @email 
 * @date 2021-05-30 19:40:34
 */
public interface ZuojiaDao extends BaseMapper<ZuojiaEntity> {
	
	List<ZuojiaVO> selectListVO(@Param("ew") Wrapper<ZuojiaEntity> wrapper);
	
	ZuojiaVO selectVO(@Param("ew") Wrapper<ZuojiaEntity> wrapper);
	
	List<ZuojiaView> selectListView(@Param("ew") Wrapper<ZuojiaEntity> wrapper);

	List<ZuojiaView> selectListView(Pagination page,@Param("ew") Wrapper<ZuojiaEntity> wrapper);
	
	ZuojiaView selectView(@Param("ew") Wrapper<ZuojiaEntity> wrapper);
	
}
