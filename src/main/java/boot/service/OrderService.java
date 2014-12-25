package boot.service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by xurongyang on 14/11/8.
 */

@Service
public class OrderService {

    private String test;

    public String getOrderService() {
        return test;
    }

    @PostConstruct
    private void test() {
        test = "xurongyang";
    }
}
