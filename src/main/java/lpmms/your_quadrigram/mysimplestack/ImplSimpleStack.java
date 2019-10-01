package lpmms.your_quadrigram.mysimplestack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class ImplSimpleStack implements SimpleStack {

    /** List of items of this SimpleStack */
    LinkedList<Item> items = new LinkedList<>();

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public int getSize() {
        return items.size();
    }

    @Override
    public void push(Item item) {
        items.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return items.peekLast();
    }

    @Override
    public Item pop() throws EmptyStackException {
        if (items.isEmpty()) {
            throw new EmptyStackException();
        }
        return items.removeLast();
    }
}
