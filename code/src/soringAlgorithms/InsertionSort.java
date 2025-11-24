package soringAlgorithms;

public class InsertionSort {

//    Insertion Sort is a simple sorting algorithm that builds the final sorted array one element at a time.
//    It works by iterating through the array, and for each element, it inserts it into its correct position among the already sorted elements to its left.
//
//    How it works:
//    Start from the second element (index 1), considering the first element as sorted.
//    Compare the current element with elements to its left.
//    Shift larger elements one position to the right to make space.
//    Insert the current element into its correct position.
//    Repeat until the array is sorted.

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j=i; j>0; j--) {
                if(arr [j]< arr[j-1]){
                    swapIndexes(arr,j,j-1);
                }
            }
        }
    }

    private static void swapIndexes(int[] array, int index1, int index2){
        int temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }

    public static void main(String[] args) {
//        int[] klpd= new int[]{13,1,41,5,1,6,8,8,33,3,25,312,2,14};
        int[] klpd=new int[]{1, 1, 2, 3, 5, 6, 8, 8, 13, 14, 25, 33, 41, 312};
        insertionSort(klpd);
        for(int i : klpd){
            System.out.print(i+", ");
        }
    }
}
