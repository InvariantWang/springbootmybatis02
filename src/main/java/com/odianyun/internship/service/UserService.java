package com.odianyun.internship.service;

import com.odianyun.internship.model.DTO.UUserDTO;
import com.odianyun.internship.model.User;

/**
 * @author wxj
 * @date 2021/7/19 - 14:20
 */
public interface UserService {
    User getById(Long id);

    void update(UUserDTO dto);
}
