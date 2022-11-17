package com.skypro.marketplace.controller;

import com.skypro.marketplace.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class OrderController {
   private final CartService cartService;

    public OrderController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public void addProduct(@RequestParam("id") List<Integer> listId) {
        this.cartService.addToCart(listId);
    }

    @GetMapping("/get")
    public List<Integer> getProduct() {
      return   this.cartService.getProduct();
    }
}
