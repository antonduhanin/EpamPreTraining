package by.epam.preTraining.dukhanin.tasks.task08.container;

import by.epam.preTraining.dukhanin.tasks.task08.exceptions.NotFoundElementException;

public class Queue<T> {
    private int size;
    private T[] elements;

    public Queue() {
        elements = (T[]) new Object[0];
    }

    public Queue(Queue queue) {
        elements = (T[]) queue.elements;
        size = queue.size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Queue{");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }


    public void enqueue(T element) {
        T[] newElements = (T[]) new Object[++size];
        System.arraycopy(elements, 0, newElements, 1, size - 1);
        newElements[0] = element;
        elements = newElements;
    }

    public T dequeue() {
        checkSize();
        T element = elements[size - 1];
        elements[--size] = null;
        return element;
    }

    public T peek() {
        checkSize();
        return elements[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    private void checkSize() {
        if (size == 0) {
            throw new NotFoundElementException("queue is empty");
        }
    }


}
