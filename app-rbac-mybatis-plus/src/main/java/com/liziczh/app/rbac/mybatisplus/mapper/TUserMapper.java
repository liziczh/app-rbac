package com.liziczh.app.rbac.mybatisplus.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liziczh.app.rbac.api.entity.TUser;

@Repository
@Mapper
public interface TUserMapper extends BaseMapper<TUser> {
}
