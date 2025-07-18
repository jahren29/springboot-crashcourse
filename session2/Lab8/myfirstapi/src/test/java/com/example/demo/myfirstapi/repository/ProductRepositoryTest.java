package com.example.demo.myfirstapi.repository;

import com.example.demo.myfirstapi.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
ProductRepository productRepository;

@BeforeEach
void setup() {
     productRepository = new ProductRepository();
}

    @Test
    void TestFindAllProducts(){
        List<Product> products = productRepository.findAll();
        List<Product> expectedProducts = new ArrayList<>();
        final AtomicLong nextId = new AtomicLong(1);

        expectedProducts.add(new Product(nextId.getAndIncrement(), "Laptop", 1200.00));
        expectedProducts.add(new Product(nextId.getAndIncrement(), "Mouse", 25.50));
        expectedProducts.add(new Product(nextId.getAndIncrement(), "Keyboard", 75.00));
        assertEquals(expectedProducts, products);
        
    }

    @Test
    void TestFindSpecificProduct(){

    Optional<Product> actualProduct = productRepository.findById(1L);

    assertTrue(actualProduct.isPresent());
    }

    @Test
    void TestSaveProduct(){
        Product product = new Product("Earphones", 1000.0);

        productRepository.save(product);

        Optional<Product> actualProduct = productRepository.findById(4L);

        assertTrue(actualProduct.isPresent());
    }


}