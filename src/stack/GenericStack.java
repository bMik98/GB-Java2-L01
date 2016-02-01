package stack;

import java.util.Collection;

public class GenericStack<E> implements Stack<E> {
    public static final int DEFAULT_SIZE = 10;
    private int currentIndex;
    private E[] elements;

    public GenericStack() {
        this(DEFAULT_SIZE);
    }

    @SuppressWarnings("unchecked")
    public GenericStack(final int size) {
        elements = (E[]) new Object[size];
        currentIndex = -1;
    }

    @Override
    public void push(E element) throws StackException {
        if ((elements.length - 1) == currentIndex) {
            throw new StackException("Stack is full");
        }
        elements[++currentIndex] = element;
    }

    @Override
    public E pop() throws StackException {
        if (currentIndex < 0) {
            throw new StackException("Stack is empty");
        }
        return elements[currentIndex--];
    }

    @Override
    public E peek() {
        return (currentIndex < 0) ? null : elements[currentIndex];
    }

    @Override
    public int getSize() {
        return currentIndex + 1;
    }

    @Override
    public boolean isEmpty() {
        return (currentIndex < 0);
    }

    @Override
    public boolean isFull() {
        return ((elements.length - 1) <= currentIndex);
    }

    @Override
    public void pushAll(Collection<? extends E> src) throws StackException {
        if (src.size() > (elements.length - currentIndex - 1)) {
            throw new StackException("Input collection is too big to fit");
        }
        for (E e : src) {
            push(e);
        }
    }

    @Override
    public void popAll(Collection<? super E> dst) throws StackException {
        if (currentIndex < 0) {
            throw new StackException("Stack is empty");
        }
        while (currentIndex >= 0) {
            dst.add(this.pop());
        }
    }
}