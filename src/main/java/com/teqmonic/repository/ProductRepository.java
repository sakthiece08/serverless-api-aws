package com.teqmonic.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.teqmonic.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class ProductRepository {

   private final DynamoDBMapper dynamoDBMapper;

   public void saveProduct(Product product) {
       dynamoDBMapper.save(product);
   }

   public Optional<Product> loadProduct(String id) {
       return Optional.ofNullable(dynamoDBMapper.load(Product.class, id));
   }

   public void deleteProduct(String id) {
       Product product = dynamoDBMapper.load(Product.class, id);
       dynamoDBMapper.delete(product);
   }

}
