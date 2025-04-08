package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuojiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuojiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuojiaView;


/**
 * 作家
 *
 * @author 
 * @email 
 * @date 2021-05-30 19:40:34
 */
public interface ZuojiaService extends IService<ZuojiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuojiaVO> selectListVO(Wrapper<ZuojiaEntity> wrapper);
   	
   	ZuojiaVO selectVO(@Param("ew") Wrapper<ZuojiaEntity> wrapper);
   	
   	List<ZuojiaView> selectListView(Wrapper<ZuojiaEntity> wrapper);
   	
   	ZuojiaView selectView(@Param("ew") Wrapper<ZuojiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuojiaEntity> wrapper);
   	
}

