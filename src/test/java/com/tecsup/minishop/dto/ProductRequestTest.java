package com.tecsup.minishop.dto;

import com.tecsup.minishop.model.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRequestTest {

    @Test
    void testToEntityAndAccessors() {
        ProductRequest request = new ProductRequest("Laptop Gamer", 3500.0, 5);

        assertEquals("Laptop Gamer", request.name());
        assertEquals(3500.0, request.price());
        assertEquals(5, request.stock());

        Product entity = request.toEntity();
        assertNull(entity.getId());
        assertEquals("Laptop Gamer", entity.getName());
        assertEquals(3500.0, entity.getPrice());
        assertEquals(5, entity.getStock());
    }
}