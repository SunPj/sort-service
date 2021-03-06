package ru.sunsongs.sortservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Контроллер для отображения главной страницы,
 * а так же возможно остальных статических страниц
 *
 * @author kraken
 * @time 8/2/14 10:06 AM
 */
@Controller
public class AppController {
    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/access-denied")
    public String accessDenied(){
        return "access_denied";
    }
}
