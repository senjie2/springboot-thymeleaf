package com.senjie.controler;

import com.senjie.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoContorller {

    @RequestMapping("/demo")
    public String demo(Model model) {
        String msg = "Hello Thymeleaf!";
        model.addAttribute("msg", msg);
        return "demo";
    }
       @RequestMapping("/")
           public String demo1(Model m) {
           User user = new User(1, "斗鱼", 12);
           m.addAttribute("user",user);
           return "demo1";
           }
}
