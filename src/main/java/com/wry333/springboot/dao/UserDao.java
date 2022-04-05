package com.wry333.springboot.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wry333.springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserDao extends BaseMapper<User> {

}
