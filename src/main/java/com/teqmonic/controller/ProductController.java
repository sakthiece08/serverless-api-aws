package com.teqmonic.controller;

import com.teqmonic.model.Product;
import com.teqmonic.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductService service;

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/product", method = RequestMethod.POST)
    public void saveProduct(@RequestBody Product product) {
        log.info("Inside saveProduct controller method");
        service.saveProduct(product);
    }

    @RequestMapping(path = "/product/{id}", method = RequestMethod.GET)
    public Product loadProduct(@PathVariable String id) {
        return service.loadProduct(id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable String id) {
        service.deleteProduct(id);
    }
}
