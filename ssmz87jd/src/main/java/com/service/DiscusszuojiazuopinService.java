package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszuojiazuopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszuojiazuopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszuojiazuopinView;


/**
 * 作家作品评论表
 *
 * @author 
 * @email 
 * @date 2021-05-30 19:40:35
 */
public interface DiscusszuojiazuopinService extends IService<DiscusszuojiazuopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszuojiazuopinVO> selectListVO(Wrapper<DiscusszuojiazuopinEntity> wrapper);
   	
   	DiscusszuojiazuopinVO selectVO(@Param("ew") Wrapper<DiscusszuojiazuopinEntity> wrapper);
   	
   	List<DiscusszuojiazuopinView> selectListView(Wrapper<DiscusszuojiazuopinEntity> wrapper);
   	
   	DiscusszuojiazuopinView selectView(@Param("ew") Wrapper<DiscusszuojiazuopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszuojiazuopinEntity> wrapper);
   	
}

