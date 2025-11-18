package recursion;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private Long getFibonacciSeriesElement(Integer index){
        if (index==1)
            return 0L;
        else if (index==2)
            return 1L;
        else
            return getFibonacciSeriesElement(index-1) + getFibonacciSeriesElement(index-2);

    }

    public List<Long> getListOfFibonacciList(Integer count){
        List<Long> list=new ArrayList<>();

        for (int i = 1; i <=count; i++) {
            list.add(getFibonacciSeriesElement(i));
        }
        return list;
    }
}
