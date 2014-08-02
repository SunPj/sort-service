package ru.sunsongs.sortservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Контроллер закрытой административной части
 *
 * @author kraken
 * @time 8/2/14 9:32 AM
 */
@Controller
public class AdminController {
    @RequestMapping("/admin")
    public String adminPage() {
        return "adminpage";
    }
}
