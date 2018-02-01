package com.wzj.appsys.pojo;

import java.io.Serializable;
import java.sql.Date;

/**
 * 
 * @author WLF
 *
 */
public class AppPromotion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5697360236039230809L;
	/**
	 * 主键id
	 */
	private int id;
	/**
	 * appId（来源于：app_info表的主键id）
	 */
	private int appId;
	/**
	 * 广告图片存储路径
	 */
	private String adPicPath;
	/**
	 * 广告点击量
	 */
	private int adPV;
	/**
	 * 轮播位（1-n）
	 */
	private int carouselPosition;
	/**
	 * 起效时间
	 */
	private Date startTime;
	/**
	 * 失效时间
	 */
	private Date endTime;
	/**
	 * 创建者（来源于backend_user用户表的用户id）
	 */
	private Integer createdBy;
	/**
	 * 更新者（来源于backend_user用户表的用户id）
	 */
	private Integer modifyBy;
	/**
	 * 创建时间
	 */
	private Date creationDate;
	/**
	 * 最新更新时间
	 */
	private Date modifyDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public String getAdPicPath() {
		return adPicPath;
	}
	public void setAdPicPath(String adPicPath) {
		this.adPicPath = adPicPath;
	}
	public int getAdPV() {
		return adPV;
	}
	public void setAdPV(int adPV) {
		this.adPV = adPV;
	}
	public int getCarouselPosition() {
		return carouselPosition;
	}
	public void setCarouselPosition(int carouselPosition) {
		this.carouselPosition = carouselPosition;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	 
	
}
