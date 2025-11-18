package dsa.stack;


import java.util.LinkedList;

public class StackWithLinkedList {

    private Integer top;
    private Integer bottom;
    private int size;

    private final LinkedList<Integer> list;

    public StackWithLinkedList() {
        list = new LinkedList<>();
        size = 0;
        top = null;
        bottom = null;
    }

    static void main(String[] args) {
        StackWithLinkedList stack = new StackWithLinkedList();
        System.out.println(stack.isEmpty());
        System.out.println(stack);
        stack.push(1);
        stack.push(12);
        stack.push(45);
        stack.push(111);
        stack.push(812);
        stack.push(445);
        System.out.println(stack);
        System.out.println(stack.peek());


        System.out.println("=================================================+=======================");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }

    @Override
    public String toString() {
        return "StackWithLinkedList{" +
                "top=" + top +
                ", bottom=" + bottom +
                ", size=" + size +
                ", list=" + list +
                '}';
    }

    public Integer peek() {
        return top;
    }

    public void push(Integer value) {
        if (top == null) {
            top = value;
            bottom = value;
            size++;
            list.addLast(value);
        } else {
            top = value;
            size++;
            list.addLast(value);
        }
    }

    public Integer pop() {
        if (top == null) {
            return null; // or throw new NoSuchElementException();
        }
        Integer val = list.removeLast();
        size--;
        if (list.isEmpty()) {
            top = null;
            bottom = null;
        } else {
            top = list.getLast();
        }
        return val;
    }

    public Boolean isEmpty() {
        return top == null;
    }

}
