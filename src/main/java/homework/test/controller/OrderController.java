package homework.test.controller;

import homework.test.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PatchMapping
    public void updateOrderStatus() {
        orderService.updateOrderStatus();
    }

    @PostMapping
    public void placeOrder() {
        orderService.placeOrder();
    }

    @DeleteMapping
    public void cancelOrder() {
        orderService.cancelOrder();
    }
}
