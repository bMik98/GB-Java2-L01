package stack;

import java.util.Collection;

public interface Stack<E> {
    // add new element to the top of the stack
    void push(E element) throws StackException;

    // return and remove an element from the top
    E pop() throws StackException;

    // return the top element but does not remove
    E peek();

    int getSize();

    boolean isEmpty();

    boolean isFull();

    // add all elements from @src to the stack
    void pushAll(Collection<? extends E> src) throws StackException;

    // pop all elements from stack to @dst
    void popAll(Collection<? super E> dst) throws StackException;
}
