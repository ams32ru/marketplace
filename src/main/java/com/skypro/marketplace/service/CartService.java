package com.skypro.marketplace.service;

import com.skypro.marketplace.model.Cart;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CartService {
    public final Cart cart;

    public CartService(Cart cart) {
        this.cart = cart;
    }

    public void addToCart(List<Integer> listId) {
        cart.addToCart(listId);
    }

    public List<Integer> getProduct() {
    return cart.getCartSession();
    }
}
