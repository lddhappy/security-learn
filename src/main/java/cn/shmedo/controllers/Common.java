package cn.shmedo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Liudongdong on 17/6/8.
 */
@Controller
public class Common {
    @RequestMapping(value = "/login", method = {RequestMethod.GET})
    public String login(ModelAndView modelAndView) {
        return "/common/login";
    }
}
