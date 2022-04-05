package com.wry333.springboot.controller;


import com.wry333.springboot.controller.utils.R;
import com.wry333.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public R test (){
        return new R(true,"hello");
    }

    @GetMapping("{id}")
    public R test2(@PathVariable int id){
        return new R(true,userService.findUserById(id));
    }
}
