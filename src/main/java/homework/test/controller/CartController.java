package homework.test.controller;

import homework.test.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CartController {
    private final CartService cartService;

    @PostMapping
    public void addProductToCart() {
        cartService.addProductToCart();
    }

    @DeleteMapping
    public void removeProductFromCart() {
        cartService.removeProductFromCart();
    }

    @PostMapping
    public void checkOut() {
        cartService.checkOut();
    }
}
