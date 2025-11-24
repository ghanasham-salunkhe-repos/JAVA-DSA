package soringAlgorithms;

public class BubbleSort {

//    In Bubble Sort, the largest value "bubbles up" to the end of the array in each pass.
//    This is a key characteristic of the Bubble Sort algorithm

    public static void bubbleSort(int[] array1){

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length-i-1; j++) {
                if (array1[j]>array1[j+1]){
                    int temp=array1[j+1];
                    array1[j+1]=array1[j];
                    array1[j]=temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] klpd= new int[]{13,1,41,5,1,6,8,8,33,3,25,312,2,14};
        bubbleSort(klpd);
        for(int i : klpd){
            System.out.print(i+", ");
        }
    }
}
