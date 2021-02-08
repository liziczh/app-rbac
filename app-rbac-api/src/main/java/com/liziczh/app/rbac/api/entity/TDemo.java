package com.liziczh.app.rbac.api.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@TableName(value = "t_demo")
public class TDemo extends BaseEntity {
	private static final long serialVersionUID = -3399850105386695874L;
	@ApiModelProperty(value = "姓名")
	@JsonProperty("name")
	@TableField(value = "NAME")
	private String name;
}
