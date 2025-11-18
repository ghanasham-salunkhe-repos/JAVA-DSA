package recursion;

import java.util.Objects;

public class MainFunctionForRecursion {

    public static String reverseString(String input){
        if(Objects.equals(input, "") || input.length()==1){
            return input;
        }
        return reverseString(input.substring(1))+ input.charAt(0);
    }


    public static void main() {
        Fibonacci fibonacci=new Fibonacci();
        System.out.println(fibonacci.getListOfFibonacciList(11));

        Factorial factorial=new Factorial();
        System.out.println(factorial.getListOfFactorialList(11));

        System.out.println(reverseString("abcd"));
    }
}
