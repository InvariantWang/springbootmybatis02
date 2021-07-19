package com.odianyun.internship.web;

import com.odianyun.internship.model.DTO.UUserDTO;
import com.odianyun.internship.model.User;
import com.odianyun.internship.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("uuser")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("getById")
    public User getById(Long id) {
        return userService.getById(id);
    }

    @PostMapping("update")
    public User update(@RequestBody UUserDTO dto){
        userService.update(dto);
        return userService.getById(dto.getId());
    }
}
