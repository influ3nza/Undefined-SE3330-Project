package com.Controller;
import com.Service.LoginService;
import com.Constant.LoginConstant;
import com.Entity.UserAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;


    //acoustic:
    //登陆服务 使用fetch通过body发送请求 post类型为"POST"
    @RequestMapping("/login")
    public boolean login(@RequestBody Map<String, String> params)
    {
        String username = params.get(LoginConstant.USERNAME);
        String password = params.get(LoginConstant.PASSWORD);
        UserAuth auth = loginService.checkUser(username, password);
        return auth != null;
    }

}