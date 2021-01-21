package assignment03;

import java.util.*;

/*
    Bradley Estus
    B00780491
 */
public class Driver {

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        List<Integer>arrList = new ArrayList<>();
        arrList.add(10);
        Assignment03.appendArray(arrList,arr);
        System.out.println(arrList.toString());

        System.out.println("================");

        List<Integer>lst1 = new ArrayList<>();
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        lst1.add(4);
        lst1.add(5);
        List<Integer>lst2 = new ArrayList<>();
        lst2.add(5);
        lst2.add(2);
        lst2.add(0);
        System.out.println(Assignment03.sumElementWise(lst1,lst2).toString());

        System.out.println("================");

        lst1 = new ArrayList();
        lst1.add(1);
        lst1.add(2);
        lst1.add(3);
        lst2 = new ArrayList();
        lst2.add(1);
        lst2.add(2);
        lst2.add(3);
        lst2.add(4);
        lst2.add(5);
        lst2.add(6);
        System.out.println(Assignment03.sumElementWise(lst1,lst2).toString());

    }
}
