package com.liziczh.app.rbac.api.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@TableName(value = "t_user")
public class TUser implements Serializable {
	private static final long serialVersionUID = -3399850105386695874L;
	@ApiModelProperty(value = "ID")
	@TableId(value = "ID", type = IdType.AUTO)
	private Integer id;
	@ApiModelProperty(value = "用户名")
	@TableField(value = "USERNAME")
	private String username;
	@ApiModelProperty(value = "创建时间")
	@TableField(value = "CREATE_TIME")
	private Date createTime;
	@ApiModelProperty(value = "创建人")
	@TableField(value = "CREATE_USER")
	private String createUser;
	@ApiModelProperty(value = "更新时间")
	@TableField(value = "UPDATE_TIME")
	private Date updateTime;
	@ApiModelProperty(value = "更新人")
	@TableField(value = "UPDATE_USER")
	private String updateUser;
	@ApiModelProperty(value = "权限角色")
	@TableField(value = "PERMIT_ROLE")
	private String permitRole;
	@ApiModelProperty(value = "是否有效")
	@TableField(value = "VALID")
	private String valid;
}
