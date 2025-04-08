package com.entity.model;

import com.entity.ZuojiazuopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 作家作品
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-30 19:40:34
 */
public class ZuojiazuopinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 作品类型
	 */
	
	private String zuopinleixing;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 作品介绍
	 */
	
	private String zuopinjieshao;
		
	/**
	 * 创作时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuangzuoshijian;
		
	/**
	 * 作家账号
	 */
	
	private String zuojiazhanghao;
		
	/**
	 * 作家姓名
	 */
	
	private String zuojiaxingming;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：作品类型
	 */
	 
	public void setZuopinleixing(String zuopinleixing) {
		this.zuopinleixing = zuopinleixing;
	}
	
	/**
	 * 获取：作品类型
	 */
	public String getZuopinleixing() {
		return zuopinleixing;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：作品介绍
	 */
	 
	public void setZuopinjieshao(String zuopinjieshao) {
		this.zuopinjieshao = zuopinjieshao;
	}
	
	/**
	 * 获取：作品介绍
	 */
	public String getZuopinjieshao() {
		return zuopinjieshao;
	}
				
	
	/**
	 * 设置：创作时间
	 */
	 
	public void setChuangzuoshijian(Date chuangzuoshijian) {
		this.chuangzuoshijian = chuangzuoshijian;
	}
	
	/**
	 * 获取：创作时间
	 */
	public Date getChuangzuoshijian() {
		return chuangzuoshijian;
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
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
