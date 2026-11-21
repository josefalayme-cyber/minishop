package com.tecsup.minishop.dto;

import com.tecsup.minishop.model.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRequestTest {

    @Test
    void testToEntityAndGettersSetters() {
        ProductRequest request = new ProductRequest();
        request.setName("Laptop Gamer");
        request.setPrice(3500.0);
        request.setStock(5);

        assertEquals("Laptop Gamer", request.getName());
        assertEquals(3500.0, request.getPrice());
        assertEquals(5, request.getStock());

        Product entity = request.toEntity();
        assertNull(entity.getId());
        assertEquals("Laptop Gamer", entity.getName());
        assertEquals(3500.0, entity.getPrice());
        assertEquals(5, entity.getStock());
    }

    @Test
    void testAllArgsConstructor() {
        ProductRequest request = new ProductRequest("Mouse", 80.0, 20);
        Product entity = request.toEntity();

        assertEquals("Mouse", entity.getName());
        assertEquals(80.0, entity.getPrice());
        assertEquals(20, entity.getStock());
    }
}