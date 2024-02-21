package com.teqmonic.service;

import com.teqmonic.model.Product;
import com.teqmonic.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;

    public void saveProduct(Product product) {
        productRepository.saveProduct(product);
    }

    public Product loadProduct(String id) {
        return productRepository.loadProduct(id).orElseThrow();
    }

    public void deleteProduct(String id) {
        productRepository.deleteProduct(id);
    }
}
