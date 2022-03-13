package com.example.test.Controller;
import com.example.test.service.UserService;
import com.example.test.bean.UserInfo;
import com.example.test.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
        return userService.findAll();
    }

    @RequestMapping("addUser")
    public void addUser(UserInfo userInfo){
        userInfo.setId("3");
        userInfo.setLoginName("zhangsan");
        userInfo.setNickName("张三");
        userInfo.setPasswd("202cb962ac59075b964b07152d234b70");
        userInfo.setName("张三");
        userInfo.setPhoneNum("333");
        userInfo.setEmail("atguigu.com");
        userInfo.setHeadImg("3");
        userInfo.setUserLevel("3");

        userService.addUser(userInfo);
        // 获取添加之后的主键
        System.out.println(userInfo.getId());
    }

}
