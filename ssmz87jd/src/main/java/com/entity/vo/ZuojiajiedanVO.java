package com.entity.vo;

import com.entity.ZuojiajiedanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 作家接单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-30 19:40:35
 */
public class ZuojiajiedanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 订单标题
	 */
	
	private String dingdanbiaoti;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 接单时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiedanshijian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 作家账号
	 */
	
	private String zuojiazhanghao;
		
	/**
	 * 作家姓名
	 */
	
	private String zuojiaxingming;
				
	
	/**
	 * 设置：订单标题
	 */
	 
	public void setDingdanbiaoti(String dingdanbiaoti) {
		this.dingdanbiaoti = dingdanbiaoti;
	}
	
	/**
	 * 获取：订单标题
	 */
	public String getDingdanbiaoti() {
		return dingdanbiaoti;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：接单时间
	 */
	 
	public void setJiedanshijian(Date jiedanshijian) {
		this.jiedanshijian = jiedanshijian;
	}
	
	/**
	 * 获取：接单时间
	 */
	public Date getJiedanshijian() {
		return jiedanshijian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：作家账号
	 */
	 
	public void setZuojiazhanghao(String zuojiazhanghao) {
		this.zuojiazhanghao = zuojiazhanghao;
	}
	
	/**
	 * 获取：作家账号
	 */
	public String getZuojiazhanghao() {
		return zuojiazhanghao;
	}
				
	
	/**
	 * 设置：作家姓名
	 */
	 
	public void setZuojiaxingming(String zuojiaxingming) {
		this.zuojiaxingming = zuojiaxingming;
	}
	
	/**
	 * 获取：作家姓名
	 */
	public String getZuojiaxingming() {
		return zuojiaxingming;
	}
			
}
