package com.example.demo.myfirstapi.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product;

    @BeforeEach
    void setUp(){
        product  = new Product(1L, "Jahren", 10.0);
    }
    @Test
    void getIdLongDataType(){
        assertEquals(1L, product.getId());
    }

    @Test
    void TestGetName(){
        assertEquals("Jahren", product.getName());

    }

    @Test
    void TestGetPrice(){
        assertEquals(10.0, product.getPrice());

    }

    @Test
    void TestSetId(){

        product  = new Product(3L, "Hans", 10.0);
        assertEquals(3L, product.getId());

    }

    @Test
    void TestSetName(){

        product  = new Product(3L, "Hans", 10.0);
        assertEquals("Hans", product.getName());

    }
}