package codes;

public class ReverseString {

    public static String reverseString(String str) {
        String[] array = str.split("");
        StringBuilder op= new StringBuilder();
        for (int i = array.length-1; i >=0 ; i--) {
            op.append(array[i]);
        }
        return op.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Hello i am Ghanasham Salunkhe"));
    }
}
