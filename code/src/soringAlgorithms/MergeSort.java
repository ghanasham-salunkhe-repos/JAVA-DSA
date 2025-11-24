package soringAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    
    public static List<Integer> mergeSort(List<Integer> arr){
        if( arr.size() == 1)
            return arr;
        
        int middle=(int)(arr.size()/2);

        return merge(
                mergeSort(arr.subList(0,middle)),
                mergeSort(arr.subList(middle,arr.size()))
        );
    }
    
    public static List<Integer> merge(List<Integer> left,List<Integer> right){

        System.out.println("left : "+left);
        System.out.println("right : "+ right);

        List<Integer> op=new ArrayList<>();

        int leftIndex=0;
        int rightIndex=0;
        while (leftIndex<left.size() && rightIndex< right.size()){
            if (left.get(leftIndex) >= right.get(rightIndex)){
                op.add(right.get(rightIndex));
                rightIndex++;
            }
            else {
                op.add(left.get(leftIndex));
                leftIndex++;
            }
        }

        while (leftIndex<left.size()){
            op.add(left.get(leftIndex));
            leftIndex++;
        }

        while (rightIndex<right.size()){
            op.add(right.get(rightIndex));
            rightIndex++;
        }

        System.out.println("op : "+op);
        return op;
    }

    static void main(String[] args) {
        List<Integer> arr= Arrays.asList(5,1, 1, 3,2, 8,6, 18, 13, 14, 25, 3, 21, 31,0);
        System.out.println(mergeSort(arr));
    }
}
