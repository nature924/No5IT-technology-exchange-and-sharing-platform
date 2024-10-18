package com.entity.model;

import com.entity.BijifenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 笔记分享
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-02 22:11:50
 */
public class BijifenxiangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 笔记类型
	 */
	
	private String bijileixing;
		
	/**
	 * 笔记标题
	 */
	
	private String bijibiaoti;
		
	/**
	 * 笔记图片
	 */
	
	private String bijitupian;
		
	/**
	 * 笔记附件
	 */
	
	private String bijifujian;
		
	/**
	 * 笔记内容
	 */
	
	private String bijineirong;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
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
	 * 设置：笔记类型
	 */
	 
	public void setBijileixing(String bijileixing) {
		this.bijileixing = bijileixing;
	}
	
	/**
	 * 获取：笔记类型
	 */
	public String getBijileixing() {
		return bijileixing;
	}
				
	
	/**
	 * 设置：笔记标题
	 */
	 
	public void setBijibiaoti(String bijibiaoti) {
		this.bijibiaoti = bijibiaoti;
	}
	
	/**
	 * 获取：笔记标题
	 */
	public String getBijibiaoti() {
		return bijibiaoti;
	}
				
	
	/**
	 * 设置：笔记图片
	 */
	 
	public void setBijitupian(String bijitupian) {
		this.bijitupian = bijitupian;
	}
	
	/**
	 * 获取：笔记图片
	 */
	public String getBijitupian() {
		return bijitupian;
	}
				
	
	/**
	 * 设置：笔记附件
	 */
	 
	public void setBijifujian(String bijifujian) {
		this.bijifujian = bijifujian;
	}
	
	/**
	 * 获取：笔记附件
	 */
	public String getBijifujian() {
		return bijifujian;
	}
				
	
	/**
	 * 设置：笔记内容
	 */
	 
	public void setBijineirong(String bijineirong) {
		this.bijineirong = bijineirong;
	}
	
	/**
	 * 获取：笔记内容
	 */
	public String getBijineirong() {
		return bijineirong;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
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
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
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
