package com.wry333.springboot.controller;


import com.wry333.springboot.domain.User;
import com.wry333.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/user")
    public ModelAndView test (ModelAndView mav){
        mav.setViewName("test");
        User user = new  User();
        user.setName("zhangsan");
        mav.addObject("stu",user);
        return mav;
    }

}
