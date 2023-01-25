package com.ddd.application;

import com.ddd.domain.Cart;
import com.ddd.domain.Product;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product product = new Product("Apple Pencil");
        cart.add(product);

        System.out.println("Cart = " + cart);
        List<Product> products = cart.getProducts();

        System.out.println("----------------------------------------");
        System.out.println("products = " + products);
        System.out.println("----------------------------------------");
    }
}
