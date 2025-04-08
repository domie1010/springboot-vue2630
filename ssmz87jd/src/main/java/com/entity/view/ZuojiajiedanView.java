package com.entity.view;

import com.entity.ZuojiajiedanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 作家接单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-30 19:40:35
 */
@TableName("zuojiajiedan")
public class ZuojiajiedanView  extends ZuojiajiedanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuojiajiedanView(){
	}
 
 	public ZuojiajiedanView(ZuojiajiedanEntity zuojiajiedanEntity){
 	try {
			BeanUtils.copyProperties(this, zuojiajiedanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
