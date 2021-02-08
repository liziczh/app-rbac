package com.liziczh.app.rbac.api.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@TableName(value = "t_role_permission")
public class TRolePermission extends BaseEntity {
	private static final long serialVersionUID = -3399850105386695874L;
	@ApiModelProperty(value = "角色Code")
	@TableField(value = "ROLE_CODE")
	private String roleCode;
	@ApiModelProperty(value = "权限Code")
	@TableField(value = "PERMISSION_CODE")
	private String permissionCode;
}
