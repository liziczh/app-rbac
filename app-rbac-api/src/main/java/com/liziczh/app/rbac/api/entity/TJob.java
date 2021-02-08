package com.liziczh.app.rbac.api.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@TableName(value = "t_job")
public class TJob extends BaseEntity {
	private static final long serialVersionUID = -3399850105386695874L;
	@ApiModelProperty(value = "职位Code")
	@TableField(value = "JOB_CODE")
	private String jobCode;
	@ApiModelProperty(value = "职位名称")
	@TableField(value = "JOB_NAME")
	private String jobName;
}
