package cn.qtech.controller;

import cn.qtech.LoginUtil;
import cn.qtech.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangruyu
 * @since 2017/3/16-15:39
 */
@RestController
public class UserController {
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User queryUserInfo() {
        return LoginUtil.getLoginUser();
    }
}
