package Main;
import OOP_Basics.*;
import java.util.LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Random_weight_test
        System.out.println("Task 1, Random Weight number");
        int[] val_arr = new int[] {1, 2, 3, 5};
        int[] weight_arr = new int[] {2, 8, 16, 5};
        Random_Weight rw1 = new Random_Weight(val_arr, weight_arr);
        System.out.println(rw1.getNum());

        // Vector_test
        int quan = (int)(Math.random() * 4 + 3);

        Vector[] vectors = Vector.random_array(quan);
        for(int i = 0; i < vectors.length; ++i)
        {
            System.out.println(vectors[i].toString());
        }

        //Linked_list
//        LinkedList<String> list = new LinkedList<String>();
//        list.add("s");
//        list.add("b");
//        for(int i = 0; i < list.size(); ++i)
//        {
//            System.out.println(list.get(i));
//        }
//        list

    }
}
