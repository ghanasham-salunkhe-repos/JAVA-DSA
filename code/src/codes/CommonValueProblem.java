package codes;//problem
//two arrays
//        a= [a,b,c]
//        b= [d,e,f]

//return false if both dont have any common value
//        return true if both have any common value

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonValueProblem {// n***2 complexity due to double for loop

    public static Boolean bruteforce(List<String> list1, List<String> list2) {
        for (String s1 : list1) {
            for (String s2 : list2) {
                if (s1.equals(s2)) {
                    return true;
                }
            }
        }
        return false;
    }

    // optimised solution
    public static Boolean optimisedSolution(List<String> list1, List<String> list2) {//o(n) complexity

//        two individual loops
        Map<String, Boolean> map = new HashMap<>();
        for (String s : list1) {
            map.put(s, true);
        }

        for (String s : list2) {
            if (map.containsKey(s)) {
                return true;
            }
        }
        return false;
    }

    static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("X", "Y", "Z", "C");

        System.out.println(bruteforce(list, list2));
        System.out.println(optimisedSolution(list, list2));
    }
}

//The brute-force approach (bruteforce method) uses a nested loop,
// resulting in O(n * m) time complexity, where n and m are the sizes of the two lists.

//The optimized approach (optimisedSolution method) uses a HashMap to store elements from
// the first list (O(n)), then iterates through the second list and checks for existence in the map (O(m)).
// This results in O(n + m) time complexity.

//Space complexity analysis:
//
//bruteforce: O(1)
//No extra data structures are used; only a few variables for iteration.

//optimisedSolution: O(n)
//A HashMap is created to store all elements from list1, where n is the size of list1.