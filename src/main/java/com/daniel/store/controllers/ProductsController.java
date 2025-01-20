package com.daniel.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daniel.store.models.Product;
import com.daniel.store.services.ProductsRepository;


@Controller
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductsRepository repository;

    @GetMapping({"", "/"})
public String showProductList(Model model) {
    List<Product> products = repository.findAll();
    model.addAttribute("products", products);
    return "product";
}



}
