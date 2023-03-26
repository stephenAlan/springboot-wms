package com.stephen.wms.controller;

import com.stephen.wms.entity.User;
import com.stephen.wms.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ssc on 2023-03-26 11:46 .
 * Description:
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("list")
    public List<User> list() {
        return userService.list();
    }


}
