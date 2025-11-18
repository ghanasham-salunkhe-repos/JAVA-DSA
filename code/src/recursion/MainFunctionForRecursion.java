package recursion;

public class MainFunctionForRecursion {
    static void main() {
        Fibonacci fibonacci=new Fibonacci();
        System.out.println(fibonacci.getListOfFibonacciList(11));

        Factorial factorial=new Factorial();
        System.out.println(factorial.getListOfFactorialList(11));
    }
}
