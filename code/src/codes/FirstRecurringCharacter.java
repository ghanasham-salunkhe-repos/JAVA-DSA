package codes;

import java.util.HashMap;
import java.util.Map;

public class FirstRecurringCharacter {
    
    public static String getFirstRecurringCharacter(String input){
        String[] chars=input.split("");
        Map<String,Boolean> map=new HashMap<>();
        for(String a:chars){
            if(map.containsKey(a)){
                return a;
            }
            map.put(a,true);
        }
        return "";

    }

    public static int getFirstRecurringCharacter(int[] input){
        Map<Integer,Boolean> map=new HashMap<>();
        for(int a:input){
            if(map.containsKey(a)){
                return a;
            }
            map.put(a,true);
        }
        return -1111111;

    }

    public static void main(String[] args) {
        System.out.println(getFirstRecurringCharacter("BACABA"));
        System.out.println(getFirstRecurringCharacter(new int[]{1,2,4,5,62,62,1,3,2}));
    }
}
