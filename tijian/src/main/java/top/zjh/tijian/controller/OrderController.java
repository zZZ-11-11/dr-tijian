package top.zjh.tijian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.zjh.tijian.pojo.Order;
import top.zjh.tijian.pojo.Result;
import top.zjh.tijian.service.inter.OrderService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/addOrder")
    public Result addOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }
}
