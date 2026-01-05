package searchingAndTraversal;

import java.util.Arrays;

public class SearchAlgorithms {

//    search algo which return index of element in list and if not present return -1
    public static int linearSearch(int[] arrayOfIntegers, int integerToSearch){

        for (int i = 0; i < arrayOfIntegers.length; i++) {
            if (arrayOfIntegers[i]==integerToSearch){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arrayOfIntegers, int integerToSearch){
        int middle=(int)arrayOfIntegers.length/2;
        int start=0;
        int end=arrayOfIntegers.length-1;
        while (start<=end){
            if( arrayOfIntegers[middle]==integerToSearch){
                return middle;
            }
            else if(integerToSearch>arrayOfIntegers[middle]){
                start=middle+1;
                middle=(int)((start+end)/2);
            }
            else{
                end=middle-1;
                middle=(int)((start+end)/2);
            }
        }
        return -1;
    }

    static void main(){

        int[] list=new int[]{1,3,52,14,523,23,2,521,512,19,49};
        Arrays.sort(list);

        for(int i:list){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(binarySearch(list,19));
        System.out.println(binarySearch(list,523));
        System.out.println(binarySearch(list,1));
    }
}
