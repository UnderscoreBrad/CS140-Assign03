package assignment03;

import java.util.*;

/*
    Bradley Estus
    B00780491
 */
public class Assignment03 {

    public static void appendArray(List<Integer>arrList, int[] arr){
        if(arrList==null||arr==null){
            throw new IllegalArgumentException("ArrayList or Array parameter in appendArray is null");
        }
        for(int i = 0; i < arr.length; i++){
            arrList.add(arr[i]);
        }
    }

    public static List<Integer> sumElementWise(List<Integer>lst1, List<Integer>lst2){
        List<Integer>rtn = new ArrayList<>();
        if(lst1==null||lst2==null){
            throw new IllegalArgumentException ("One or more ArrayList parameters in sumElementWise is null");
        }

        while(lst2.size()>lst1.size()){
                lst1.add(0);
            }
        while(lst1.size()>lst2.size()){
                lst2.add(0);
        }

        for(int i = 0; i < lst1.size();i++){
            rtn.add(lst1.get(i)+lst2.get(i));
        }
        return rtn;
    }
}
