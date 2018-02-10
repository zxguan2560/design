package com.ltchu.controller;

import com.ltchu.model.BaseResponse;
import com.ltchu.model.LoginAccount;
import com.ltchu.repository.LoginAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController extends BaseController {

    @Autowired
    private LoginAccountRepository loginAccountRepository;

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/loginin")
    @ResponseBody
    public BaseResponse loginin(@RequestParam String account, @RequestParam String password) {
        LoginAccount loginAccount = loginAccountRepository.findByAccount(account);
        if (null == loginAccount) {
            return super.sendFailMsg("该账号不存在！");
        }
        if (!password.equals(loginAccount.getPassword())) {
            return super.sendFailMsg("账号或密码不正确！");
        }
        return super.sendSuccessMsg("登陆成功！");
    }

    @RequestMapping(value = "/index")
    public String index() {
        return "home";
    }

    @RequestMapping(value = {"/", "/home"})
    public String home() {
        return "home";
    }

}
