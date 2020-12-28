package com.liziczh.app.rbac.mybatisplus.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liziczh.app.rbac.api.entity.TRole;

@Repository
@Mapper
public interface TRoleMapper extends BaseMapper<TRole> {
}
