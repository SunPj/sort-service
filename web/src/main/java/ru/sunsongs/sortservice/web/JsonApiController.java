package ru.sunsongs.sortservice.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.sunsongs.sortservice.model.JsonApiSortRequest;
import ru.sunsongs.sortservice.model.JsonApiSortResponse;
import ru.sunsongs.sortservice.service.UserService;
import ru.sunsongs.sortservice.service.exception.NotEnoughBalanceException;
import ru.sunsongs.sortservice.service.exception.RestApiRequestException;
import ru.sunsongs.sortservice.service.exception.UnknownSortTypeException;

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
        } catch (RestApiRequestException e){
            response.setSuccess(false);
            response.setErrorMessage("Ошибка данных в запросе: "+e.getMessage());
        }

        return response;
    }
}
