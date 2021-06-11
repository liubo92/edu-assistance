package com.edu.eduassistance.controller.user;

import com.edu.eduassistance.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lb
 * @create 2021-05-13
 */
@RequestMapping("/user")
@Controller
public class UserController {

    /**
     * 返回数据
     * @param req
     * @return
     */
    @ResponseBody
    @GetMapping(value = "/getUser")
    public UserEntity getuser(HttpServletRequest req,HttpServletRequest rep) {

        UserEntity adas = UserEntity.builder().address("adas").build();

        return adas;
    }


    /**
     * 返回用户界面
     * @param req
     * @return
     */
    @GetMapping(value = "/userIndex")
    public String getuser2(HttpServletRequest req) {

        return "/user/user";
    }
}