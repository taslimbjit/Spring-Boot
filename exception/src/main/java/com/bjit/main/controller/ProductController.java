package com.bjit.main.controller;

import com.bjit.main.entity.Product;
import com.bjit.main.model.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService pService;

    @GetMapping("/products")
    public List<Product> getList () {
        return pService.getList();
    }

    @GetMapping("/products/{id}")
    public Product get (@PathVariable Integer id) {
        return pService.getProduct(id);
    }
}
