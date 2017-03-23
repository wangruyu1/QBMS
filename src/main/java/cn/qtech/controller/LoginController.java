package cn.qtech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author wangruyu
 * @since 2017/3/15-11:07
 */
@Controller
public class LoginController {
    @RequestMapping(value = {"/login","/"},method = RequestMethod.GET)
    public ModelAndView login(){
        return new ModelAndView("/login");
    }
    @RequestMapping(value = {"/home","/index"},method = RequestMethod.GET)
    public ModelAndView home(){
        return new ModelAndView("/index");
    }
}
