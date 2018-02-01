package com.wzj.appsys.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * App所属分类
 * @author WLF
 *
 */
public class AppCategory implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 主键ID
	 */
	private Integer id;
	/**
	 * 分类编码
	 */
	private String categoryCode;
	/**
	 * 分类名称
	 */
	private String categoryName;
	/**
	 * 父级节点id
	 */
	private Integer parentId;
	/**
	 * 创建者（来源于backend_user用户表的用户id）
	 */
	private Integer createdBy;
	/**
	 * 创建时间
	 */
	private Date creationDate;
	/**
	 * 更新者（来源于backend_user用户表的用户id）
	 */
	private Integer modifyBy;
	/**
	 * 最新更新时间
	 */
	private Date modifyDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
}
