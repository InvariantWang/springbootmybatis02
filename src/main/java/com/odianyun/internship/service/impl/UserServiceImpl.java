package com.odianyun.internship.service.impl;

import com.odianyun.internship.mapper.UserMapper;
import com.odianyun.internship.model.DTO.UUserDTO;
import com.odianyun.internship.model.User;
import com.odianyun.internship.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wxj
 * @date 2021/7/19 - 14:25
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public User getById(Long id) {
        return userMapper.getById(id);
    }

    @Override
    public void update(UUserDTO dto) {
        userMapper.update(dto);
    }
}
