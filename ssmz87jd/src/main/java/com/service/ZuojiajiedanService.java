package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuojiajiedanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuojiajiedanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuojiajiedanView;


/**
 * 作家接单
 *
 * @author 
 * @email 
 * @date 2021-05-30 19:40:35
 */
public interface ZuojiajiedanService extends IService<ZuojiajiedanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuojiajiedanVO> selectListVO(Wrapper<ZuojiajiedanEntity> wrapper);
   	
   	ZuojiajiedanVO selectVO(@Param("ew") Wrapper<ZuojiajiedanEntity> wrapper);
   	
   	List<ZuojiajiedanView> selectListView(Wrapper<ZuojiajiedanEntity> wrapper);
   	
   	ZuojiajiedanView selectView(@Param("ew") Wrapper<ZuojiajiedanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuojiajiedanEntity> wrapper);
   	
}

