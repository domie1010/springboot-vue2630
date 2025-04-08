package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghudingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghudingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghudingdanView;


/**
 * 用户订单
 *
 * @author 
 * @email 
 * @date 2021-05-30 19:40:35
 */
public interface YonghudingdanService extends IService<YonghudingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghudingdanVO> selectListVO(Wrapper<YonghudingdanEntity> wrapper);
   	
   	YonghudingdanVO selectVO(@Param("ew") Wrapper<YonghudingdanEntity> wrapper);
   	
   	List<YonghudingdanView> selectListView(Wrapper<YonghudingdanEntity> wrapper);
   	
   	YonghudingdanView selectView(@Param("ew") Wrapper<YonghudingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghudingdanEntity> wrapper);
   	
}

