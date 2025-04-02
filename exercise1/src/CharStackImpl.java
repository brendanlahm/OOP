package exercise1;

import java.util.ArrayList;
import java.util.List;

public class CharStackImpl implements CharStack {
    private List<Character> stack;

    public CharStackImpl() {
        stack = new ArrayList<>();
    }

    @Override
    public void push(char c) {
        stack.add(c);
    }

    @Override
    public char pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty! Cannot pop.");
        }
        return stack.remove(stack.size() - 1);
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}


