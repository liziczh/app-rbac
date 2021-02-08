package com.liziczh.app.rbac.api.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@TableName(value = "t_user_group")
public class TGroup extends BaseEntity {
	private static final long serialVersionUID = -3399850105386695874L;
	@ApiModelProperty(value = "用户组Code")
	@TableField(value = "GROUP_CODE")
	private String groupCode;
	@ApiModelProperty(value = "用户组名称")
	@TableField(value = "GROUP_NAME")
	private String groupName;
}
