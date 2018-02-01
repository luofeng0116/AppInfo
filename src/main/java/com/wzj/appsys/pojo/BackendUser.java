package com.wzj.appsys.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 后台用户
 * @author WLF
 *
 */
public class BackendUser implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 主键id
	 */
	private Integer id;
	/**
	 * 用户编码
	 */
	private String userCode;
	/**
	 * 用户名称
	 */
	private String userName;
	/**
	 * 用户密码
	 */
	private String userPassword;
	/**
	 * 用户角色类型（来源于数据字典表，分为：超管、财务、市场、运营、销售）
	 */
	private Integer userType;
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
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Integer getUserType() {
		return userType;
	}
	public void setUserType(Integer userType) {
		this.userType = userType;
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
