package com.lizza.consumer.controller;

import com.lizza.api.UserService;
import com.lizza.entity.Address;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Desc:
 * @author: lizza1643@gmail.com
 * @date: 2020-12-09
 */
@RestController
@RequestMapping
public class UserController {

    @DubboReference(timeout = 1700)
    private UserService userService;

    @GetMapping("/getAddressByUserId")
    public List<Address> getAddressByUserId(int id) {
        return userService.getAddressByUserId(id);
    }
}
