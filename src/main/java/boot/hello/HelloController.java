package boot.hello;

import boot.domain.City;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import boot.service.CityService;
import boot.service.OrderService;

import java.util.List;

/**
 * Created by xurongyang on 14/11/8.
 */

@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private OrderService orderService;

    @Autowired
    private CityService cityService;

    @RequestMapping("/")
    public String index() {
        return orderService.getOrderService();
    }

    @RequestMapping("/getCity")
    public Object get(@RequestParam(value = "name") String name) {
        logger.info("get " + name);
        City city = cityService.get(name);
        if (city != null) {
            return city;
        } else {
            return "{\"success\":\"false\"}";
        }
    }

    @RequestMapping("/addCity")
    public long insert(@RequestParam(value = "name") String name) {
        return cityService.insert(name);
    }

    @RequestMapping("/getAll")
    public Object get(@RequestParam(value = "id") long id,
                      @RequestParam(value = "name") String name) {
        List<City> cities = cityService.getAll(id, name);
        return cities;
    }
}
