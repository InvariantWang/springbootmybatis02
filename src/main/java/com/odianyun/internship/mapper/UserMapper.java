package com.odianyun.internship.mapper;

import com.odianyun.internship.model.DTO.UUserDTO;
import com.odianyun.internship.model.User;


public interface UserMapper {
    User getById (Long id);

    void update(UUserDTO dto);
}
