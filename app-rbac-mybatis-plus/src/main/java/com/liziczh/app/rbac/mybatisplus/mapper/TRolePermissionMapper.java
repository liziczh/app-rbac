package com.liziczh.app.rbac.mybatisplus.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liziczh.app.rbac.api.entity.TRolePermission;

@Repository
@Mapper
public interface TRolePermissionMapper extends BaseMapper<TRolePermission> {
}
