package codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeSortArrayProblem {

    private static List<Integer> getMergedArray(List<Integer> l1, List<Integer> l2) {
        var merged=new ArrayList<>(l2);
        merged.addAll(l1);
        return merged;
    }

    private static List<Integer> sort(List<Integer> integerList){
        for(int j=0;j<integerList.size()-1;j++){
            for(int k=j+1;k<integerList.size();k++){
                if(integerList.get(j) > integerList.get(k)){
                    Collections.swap(integerList,j,k);
                }
            }

        }
        return integerList;
    }

//    lets write with predefined functions
    private static List<Integer> mergesort(List<Integer> l1, List<Integer> l2) {
        var merged=new ArrayList<Integer>(l1);
        merged.addAll(l2);
        Collections.sort(merged);
        return merged;

    }

    public static void main(String[] args) {
        System.out.println("Merge Sort Array Problem");
        List<Integer> op=getMergedArray(Arrays.asList(1,4,1,9),Arrays.asList(5,7,2,4,1));

        System.out.println(sort(op));
        System.out.println(mergesort(Arrays.asList(1,4,1,9),Arrays.asList(5,7,2,4,1)));
    }
}
