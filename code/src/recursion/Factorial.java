package recursion;

import java.util.ArrayList;
import java.util.List;

public class Factorial {

    private Long getFactorialSeriesElement(Integer index){
        if (index==1)
            return 1L;
        else if (index==2)
            return 2L;
        else
            return getFactorialSeriesElement(index-1) * getFactorialSeriesElement(index-2);

    }

    public List<Long> getListOfFactorialList(Integer count){
        List<Long> list=new ArrayList<>();

        for (int i = 1; i <=count; i++) {
            list.add(getFactorialSeriesElement(i));
        }
        return list;
    }
}
