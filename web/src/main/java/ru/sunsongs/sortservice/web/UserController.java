package ru.sunsongs.sortservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.sunsongs.sortservice.model.SortRequest;
import ru.sunsongs.sortservice.service.UserService;

import java.util.Map;
import java.util.Set;

/**
 * Контроллер для личного кабинета
 * для пользователей системы
 *
 * @author kraken
 * @time 8/2/14 9:06 AM
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user")
    public String adminPage(Map<String, Object> map) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        Set<SortRequest> requests = userService.getUserByName(name).getRequests();
        map.put("requests", requests);

        return "userpage";
    }
}
