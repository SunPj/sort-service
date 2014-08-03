package ru.sunsongs.sortservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Контроллер для личного кабинета
 * для пользователей системы
 *
 * @author kraken
 * @time 8/2/14 9:06 AM
 */
@Controller
public class UserController {
    @RequestMapping("/user")
    public String adminPage() {
        return "userpage";
    }
}
