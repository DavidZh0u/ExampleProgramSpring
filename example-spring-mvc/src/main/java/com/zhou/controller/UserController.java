package com.zhou.controller;

import com.zhou.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoudawei
 * @mail zdw0607@gmail.com
 * @date 2019-09-09 14:07
 */
@Controller
public class UserController {

    @RequestMapping("queryUser")
    public ModelAndView queryItem(){
        // 静态数据模拟
        List<User> users = new ArrayList<>();

        User u1 = new User();
        u1.setName("狂暴战");
        u1.setAge(28);
        u1.setSex(true);
        u1.setEmail("zhanshi@gmail.com");
        u1.setDescription("好马配好鞍，好武器配狂暴战士。");

        User u2 = new User();
        u2.setName("兽王猎");
        u2.setAge(28);
        u2.setSex(false);
        u2.setEmail("lieren@gmail.com");
        u2.setDescription("好马配好鞍，好宠物配狂暴战士。");

        users.add(u1);
        users.add(u2);

        ModelAndView mvAndView = new ModelAndView();
        mvAndView.addObject("users", users);
        mvAndView.setViewName("user/user-list");
        return mvAndView;
    }

}
