package com.entity.view;

import com.entity.DiscusszuojiazuopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 作家作品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-30 19:40:35
 */
@TableName("discusszuojiazuopin")
public class DiscusszuojiazuopinView  extends DiscusszuojiazuopinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusszuojiazuopinView(){
	}
 
 	public DiscusszuojiazuopinView(DiscusszuojiazuopinEntity discusszuojiazuopinEntity){
 	try {
			BeanUtils.copyProperties(this, discusszuojiazuopinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
