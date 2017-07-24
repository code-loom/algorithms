/**
 * Classic Stack implementation with following features
 * 1. Push
 * 2. Pop
 */

public class Stack {
    private int stack_size;
    private Node top_of_stack;

    /**
     * No one needs to know the implementation of Node, which is why making it private class
     */
    private class Node {
        private Item item;
        private Node next;
    }
}