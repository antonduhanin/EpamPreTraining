package by.epam.preTraining.dukhanin.tasks.task08.test;


import by.epam.preTraining.dukhanin.tasks.task08.container.Queue;
import by.epam.preTraining.dukhanin.tasks.task08.container.Stack;


public class Test {
    public static void main(String[] args) {
        //test Stack
        Stack stack = new Stack();
        stack.push(new Integer(2));
        stack.push(new Double(4.1));
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println("size: " + stack.getSize());
        System.out.println("is empty? " + stack.isEmpty());
        Stack stackCopy = new Stack(stack);

        System.out.println(stack);
        System.out.println(stackCopy);

        System.out.println("------------------------------------------------------------");

        //test Palindrome
        String s = "not";
        stack = new Stack();
        stack.push('n');
        stack.push('o');
        stack.push('t');
        System.out.println("'not' is palindrome? " + s.equals(new Character((Character) stack.pop()).toString() +
                new Character((Character) stack.pop()).toString() + new Character((Character) stack.pop()).toString()));

        s = "level";
        stack = new Stack();
        stack.push('l');
        stack.push('e');
        stack.push('v');
        stack.push('e');
        stack.push('l');
        System.out.println("'level' is palindrome? " + s.equals(new Character((Character) stack.pop()).toString() +
                new Character((Character) stack.pop()).toString() + new Character((Character) stack.pop()).toString()
                + new Character((Character) stack.pop()).toString() + new Character((Character) stack.pop()).toString()));


        System.out.println("------------------------------------------------------------");

        //test Queue
        Queue queue = new Queue();
        queue.enqueue(new Character('2'));
        queue.enqueue(new Character('4'));
        System.out.println(queue);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());


        System.out.println("size: " + queue.getSize());
        System.out.println("isEmpty? " + queue.isEmpty());
    }
}
