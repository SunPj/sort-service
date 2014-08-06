package ru.sunsongs.sortservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.sunsongs.sortservice.service.SortRequestService;

import java.util.Map;

/**
 * Контроллер закрытой административной части
 *
 * @author kraken
 * @time 8/2/14 9:32 AM
 */
@Controller
public class AdminController {
    @Autowired
    SortRequestService sortRequestService;

    @RequestMapping("/admin")
    public String adminPage(Map<String, Object> map) {
        map.put("requests", sortRequestService.getAll());

        return "adminpage";
    }
}
