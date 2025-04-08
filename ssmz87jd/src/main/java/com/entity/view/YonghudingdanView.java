package com.entity.view;

import com.entity.YonghudingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-30 19:40:35
 */
@TableName("yonghudingdan")
public class YonghudingdanView  extends YonghudingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghudingdanView(){
	}
 
 	public YonghudingdanView(YonghudingdanEntity yonghudingdanEntity){
 	try {
			BeanUtils.copyProperties(this, yonghudingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
