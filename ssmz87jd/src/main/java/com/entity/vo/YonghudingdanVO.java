package com.entity.vo;

import com.entity.YonghudingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 用户订单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-30 19:40:35
 */
public class YonghudingdanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 订单标题
	 */
	
	private String dingdanbiaoti;
		
	/**
	 * 订单要求
	 */
	
	private String dingdanyaoqiu;
		
	/**
	 * 价格
	 */
	
	private Float jiage;
		
	/**
	 * 完成时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date wanchengshijian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
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
	 * 设置：订单要求
	 */
	 
	public void setDingdanyaoqiu(String dingdanyaoqiu) {
		this.dingdanyaoqiu = dingdanyaoqiu;
	}
	
	/**
	 * 获取：订单要求
	 */
	public String getDingdanyaoqiu() {
		return dingdanyaoqiu;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Float jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Float getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：完成时间
	 */
	 
	public void setWanchengshijian(Date wanchengshijian) {
		this.wanchengshijian = wanchengshijian;
	}
	
	/**
	 * 获取：完成时间
	 */
	public Date getWanchengshijian() {
		return wanchengshijian;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
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
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
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
