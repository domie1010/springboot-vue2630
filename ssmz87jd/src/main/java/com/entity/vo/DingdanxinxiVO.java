package com.entity.vo;

import com.entity.DingdanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 订单信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-30 19:40:35
 */
public class DingdanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 订单标题
	 */
	
	private String dingdanbiaoti;
		
	/**
	 * 作品
	 */
	
	private String zuopin;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 订单状态
	 */
	
	private String dingdanzhuangtai;
		
	/**
	 * 完成时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date wanchengshijian;
		
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
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：作品
	 */
	 
	public void setZuopin(String zuopin) {
		this.zuopin = zuopin;
	}
	
	/**
	 * 获取：作品
	 */
	public String getZuopin() {
		return zuopin;
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
	 * 设置：订单状态
	 */
	 
	public void setDingdanzhuangtai(String dingdanzhuangtai) {
		this.dingdanzhuangtai = dingdanzhuangtai;
	}
	
	/**
	 * 获取：订单状态
	 */
	public String getDingdanzhuangtai() {
		return dingdanzhuangtai;
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
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
