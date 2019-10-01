package lpmms.your_quadrigram.mysimplestack;

import static lpmms.your_quadrigram.mysimplestack.Item.MIN_VALUE;
import static lpmms.your_quadrigram.mysimplestack.Item.MAX_VALUE;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test(expected = Exception.class)
    public void testAddAboveMaxValue() throws Exception {
        // Given an item that has already reached the max value
        Item item = new Item();
        item.setValue(MAX_VALUE);

        // Then throw an Exception
        item.add(2);
    }

    @Test
    public void testAddBelowMaxValue() throws Exception {
        // Given an item that has not reached the max value
        Item item = new Item();
        item.setValue(MIN_VALUE);

        // Then don't throw an Exception
        item.add(2);
    }



    @Test(expected = Exception.class)
    public void testDecrementBelowMinValue() throws Exception {
        // Given an item that has already reached the min value
        Item item = new Item();
        item.setValue(MIN_VALUE);

        // Then throw an Exception
        item.decrement(2);
    }

    @Test
    public void testDecrementAbovaMinValue() throws Exception {
        // Given an item that has not reached the min value
        Item item = new Item();
        item.setValue(2);

        // Then don't throw an Exception
        item.decrement(2);
    }

    @Test
    public void testEqualsOnDifferentItems() throws Exception {
        // Given two different items
        Item item = new Item();
        item.setName("Item One");

        Item item2 = new Item();
        item2.setName("Item One");
        item2.setValue(10);

        // Then check if the items are different
        assertEquals(item.getName(), item.getName());
        assertNotEquals(item.getValue(), item2.getValue());
        assertNotEquals("The two items can't be the same", item, item2);
    }

    @Test
    public void testEqualsOnSameValueItems() throws Exception{
        // Given two items with the same values
        Item item = new Item();
        item.setName("Item One");
        item.setValue(10);

        Item item2 = new Item();
        item2.setName("Item One");
        item2.setValue(10);

        // Then check if the items are different
        assertEquals(item.getName(), item.getName());
        assertEquals(item.getValue(), item2.getValue());
        assertTrue(item.equals(item2));
    }

    @Test(expected = Exception.class)
    public void testSetValueAboveMax() throws Exception {
        // Given an item that has already reached the min value
        Item item = new Item();
        item.setValue(MAX_VALUE);

        // Then throw an exception
        item.setValue(item.getValue() + 1);
    }

    @Test(expected = Exception.class)
    public void testSetValueBelowMin() throws Exception {
        // Given an item that has already reached the min value
        Item item = new Item();
        item.setValue(MIN_VALUE);

        // Then throw an exception
        item.setValue(item.getValue() - 1);
    }



}