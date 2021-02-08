package com.liziczh.app.rbac.api.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@TableName(value = "t_system")
public class TSystem extends BaseEntity {
	private static final long serialVersionUID = -3399850105386695874L;
	@ApiModelProperty(value = "系统Code")
	@TableField(value = "SYSTEM_CODE")
	private String systemCode;
	@ApiModelProperty(value = "系统名称")
	@TableField(value = "SYSTEM_NAME")
	private String systemName;
}
