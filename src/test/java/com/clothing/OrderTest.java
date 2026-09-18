package com.clothing;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static javax.swing.text.StyleConstants.Size;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    @Test
    public <Top, Bottom> void testGetTotalAmount() {
        Top t = new Top("T-Shirt", Size.M, new BigDecimal("10.50"), Material.COTTON, Sleeves.SHORT);
        Bottom b = new Bottom("Jeans", Size.L, new BigDecimal("20.00"), Material.OTHER, 32);

        Order order = new Order(LocalDate.now(), "Test order");
        order.addItem(new OrderItem(t, 2));
        order.addItem(new OrderItem(b, 1));

        BigDecimal expected = new BigDecimal("41.00");
        assertEquals(0, expected.compareTo(order.getTotalAmount()), "Total should be 41.00");
    }
}