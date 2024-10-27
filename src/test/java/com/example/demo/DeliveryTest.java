package com.example.demo;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.delivery.DHLDeliveryStrategy;
import com.example.demo.delivery.Delivery;
import com.example.demo.delivery.PostDeliveryStrategy;

public class DeliveryTest {

    private Delivery dhlDelivery;
    private Delivery postDelivery;
    private List<Item> itemList;
    private Order order;

    @BeforeEach
    public void setUp() {
        dhlDelivery = new DHLDeliveryStrategy();
        postDelivery = new PostDeliveryStrategy();
        
        // Create items with name and price
        itemList = Arrays.asList(new Item("item1", 10.0), new Item("item2", 20.0));
        
        order = new Order(itemList, dhlDelivery);
    }

    @Test
    public void testDHLDeliveryNotification() {
        assertEquals("Delivery with DHL", dhlDelivery.getDeliveryNotification(), 
                     "DHL delivery notification should be correct.");
    }

    @Test
    public void testPostDeliveryNotification() {
        assertEquals("Delivery with simple Post", postDelivery.getDeliveryNotification(), 
                     "Post delivery notification should be correct.");
    }

    @Test
    public void testOrderCreationWithDHL() {
        assertEquals(itemList, order.getItems(), "Order items should match the initial list.");
        assertEquals(dhlDelivery, order.getDelivery(), "Delivery strategy should be DHL.");
    }

    @Test
    public void testSetNewDeliveryMethod() {
        order.setDelivery(postDelivery);
        assertEquals(postDelivery, order.getDelivery(), "Order delivery should be updated to Post.");
    }

    @Test
    public void testSetNewItemsList() {
        List<Item> newItems = Arrays.asList(new Item("item3", 15.0), new Item("item4", 25.0));
        order.setItems(newItems);
        assertEquals(newItems, order.getItems(), "Order items should be updated to new list.");
    }
}
