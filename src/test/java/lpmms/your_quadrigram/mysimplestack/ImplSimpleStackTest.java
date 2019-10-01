package lpmms.your_quadrigram.mysimplestack;

import java.util.EmptyStackException;
import org.junit.Test;


import static org.junit.Assert.*;

public class ImplSimpleStackTest {

    @Test
    public void testCreateEmptyStack() { // Test case

        // When a freshly stack is created
        SimpleStack stack = new ImplSimpleStack();

        // Then… (oracle)
        assertTrue("A new stack should be empty", stack.isEmpty());
        assertEquals("A new stack has no element", 0, stack.getSize());
    }

    @Test(expected = EmptyStackException.class)
    public void testPopOnEmptyStack() throws EmptyStackException {
        // Given an empty stack
        SimpleStack stack = new ImplSimpleStack();

        // When we « pop » the stack
        stack.pop(); // should throws an EmptyStackException.
    }

    @Test
    public void testPush() throws EmptyStackException {

        // Given an empty stack and an item
        SimpleStack stack = new ImplSimpleStack();
        Item item = new Item();

        // When the item is pushed in the stack
        stack.push(item);

        // Then…
        assertFalse("The stack must be not empty", stack.isEmpty());
        assertEquals("The stack constains 1 item", 1, stack.getSize());
        assertSame("The pushed item is on top of the stack", item, stack.peek());
    }

    @Test
    public void testPop() throws EmptyStackException {

        // Given an empty stack and an item
        SimpleStack stack = new ImplSimpleStack();
        Item item = new Item();

        // When the item is pushed in the stack
        stack.push(item);
        stack.pop();

        // Then…
        assertTrue("The stack must be empty", stack.isEmpty());
        assertEquals("The stack constains 1 item", 0, stack.getSize());
    }
}