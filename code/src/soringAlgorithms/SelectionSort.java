package soringAlgorithms;

import java.lang.module.FindException;

public class SelectionSort {
//    In Selection Sort, for each iteration, the algorithm finds the index of the smallest value in the unsorted part of the array and swaps it with the element at the current position (i).
//    The next iteration starts from i+1, progressively sorting the array from the front.

    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length ; i++) {
            int smallestValueIndex=i;
            for (int j = i+1; j < array.length; j++) {
                if ( array[smallestValueIndex]> array[j]){
                    System.out.println("switched");
                    smallestValueIndex=j;
                }
            }
            System.out.println(array[smallestValueIndex]);
            swapIndexes(array,i,smallestValueIndex);
        }
    }

    private static void swapIndexes(int[] array, int index1, int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }

    public static void main(String[] args) {
        int[] klpd= new int[]{13,1,41,5,1,6,8,8,33,3,25,312,2,14};
        selectionSort(klpd);
        for(int i : klpd){
            System.out.print(i+", ");
        }
    }
}
