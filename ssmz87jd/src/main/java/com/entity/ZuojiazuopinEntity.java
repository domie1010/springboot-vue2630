package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 作家作品
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-30 19:40:34
 */
@TableName("zuojiazuopin")
public class ZuojiazuopinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZuojiazuopinEntity() {
		
	}
	
	public ZuojiazuopinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 作品名称
	 */
					
	private String zuopinmingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：作品名称
	 */
	public void setZuopinmingcheng(String zuopinmingcheng) {
		this.zuopinmingcheng = zuopinmingcheng;
	}
	/**
	 * 获取：作品名称
	 */
	public String getZuopinmingcheng() {
		return zuopinmingcheng;
	}
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
