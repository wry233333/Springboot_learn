package com.wry333.springboot.controller;


import com.wry333.springboot.dao.UserDao;
import com.wry333.springboot.domain.User;
import com.wry333.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public  String  test (){
        return "hello";
    }

    @GetMapping("/{id}")
    public String test2(@PathVariable int id){
        User user = userService.findUserById(id);
        return user.toString();
    }
}
