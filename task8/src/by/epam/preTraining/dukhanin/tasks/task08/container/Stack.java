package by.epam.preTraining.dukhanin.tasks.task08.container;

import by.epam.preTraining.dukhanin.tasks.task08.exceptions.NotFoundElementException;

import java.util.Arrays;

public class Stack<T> {
    private int size;
    private T[] elements;

    public Stack() {
        elements = (T[]) new Object[0];
    }

    public Stack(Stack stack) {
        elements = (T[]) stack.elements;
        size = stack.size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Stack{");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public void push(T element) {
        elements = Arrays.copyOf(elements, ++size);
        elements[size - 1] = element;
    }

    public T pop() {
        checkSize();
        T element = elements[--size];
        elements[size] = null;
        return element;
    }

    public T peek() {
        checkSize();
        return elements[size - 1];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void checkSize() {
        if (size == 0) {
            throw new NotFoundElementException("stack is empty");
        }
    }
}
