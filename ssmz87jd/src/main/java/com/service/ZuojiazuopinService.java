package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuojiazuopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuojiazuopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuojiazuopinView;


/**
 * 作家作品
 *
 * @author 
 * @email 
 * @date 2021-05-30 19:40:34
 */
public interface ZuojiazuopinService extends IService<ZuojiazuopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuojiazuopinVO> selectListVO(Wrapper<ZuojiazuopinEntity> wrapper);
   	
   	ZuojiazuopinVO selectVO(@Param("ew") Wrapper<ZuojiazuopinEntity> wrapper);
   	
   	List<ZuojiazuopinView> selectListView(Wrapper<ZuojiazuopinEntity> wrapper);
   	
   	ZuojiazuopinView selectView(@Param("ew") Wrapper<ZuojiazuopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuojiazuopinEntity> wrapper);
   	
}

