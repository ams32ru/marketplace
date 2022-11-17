package com.skypro.marketplace.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Cart {
    private final List<Integer> cartSession = new ArrayList<>();

    public void addToCart(List<Integer> cartList) {
        cartSession.addAll(cartList);
    }

    public List<Integer> getCartSession() {
        return cartSession;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartSession=" + cartSession +
                '}';
    }
}
