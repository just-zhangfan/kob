package com.kob.backend.controller.pk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pk/")
public class indexController {

    @RequestMapping("index/")
    public String index() {
        return "pk/index.html"; // 返回对应的html页面路径(默认在templates.pk下)
    }

}
