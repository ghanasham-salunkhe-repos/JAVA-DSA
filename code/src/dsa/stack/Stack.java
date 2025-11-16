package dsa.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//lets create a stack in java with list in java
public class Stack {

    private Integer top;
    private Integer bottom;
    private int size;

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                ", bottom=" + bottom +
                ", size=" + size +
                ", list=" + list +
                '}';
    }

    private Stack(){
        top = null;
        bottom = null;
        size = 0;
        list = new ArrayList<>();
    }

    List<Integer> list = new ArrayList<>();

    public void push(int data){
        if(top==null){
            top=data;
            bottom=data;
            list.add(data);
            size++;
        }
        else{
            list.add(data);
            top=data;
            size++;
        }
    }

    public Integer peek(){
        return Objects.requireNonNullElse(top, -1);
    }

    public Integer pop(){
        Integer val=list.remove(size-1);
        size--;
        top=list.get(size-1);
        return val;
    }

    public void printStack(){
        System.out.println(list);
    }

    public Boolean isEmpty(){
        return Objects.equals(top, bottom);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
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
}

