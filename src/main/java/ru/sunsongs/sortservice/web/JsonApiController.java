package ru.sunsongs.sortservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.sunsongs.sortservice.exception.NotEnoughBalanceException;
import ru.sunsongs.sortservice.exception.UnknownSortTypeException;
import ru.sunsongs.sortservice.model.JsonApiSortRequest;
import ru.sunsongs.sortservice.model.JsonApiSortResponse;
import ru.sunsongs.sortservice.service.UserService;

/**
 * Контроллер отвечающий за обработку запросов с
 * JSON API
 *
 * @author kraken
 * @time 8/3/14 12:07 AM
 */
@Controller
public class JsonApiController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/api/sort", method = RequestMethod.POST)
    @ResponseBody
    public JsonApiSortResponse sortController(@RequestBody JsonApiSortRequest sortRequest) {
        JsonApiSortResponse response = new JsonApiSortResponse();
        try {
            response.setSortedArray(userService.sortArray(sortRequest));
            response.setSuccess(true);
        } catch (UnknownSortTypeException | NotEnoughBalanceException e) {
            response.setSuccess(false);
            response.setErrorMessage(e.getMessage());
        }

        return response;
    }
}
