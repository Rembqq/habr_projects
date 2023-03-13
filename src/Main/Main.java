package Main;
import Task_2_0.Vector;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter vectors quantity: ");
        int quan = scanner.nextInt();
        Vector[] vectors = Vector.random_array(quan);
        for(int i = 0; i < vectors.length; ++i)
        {
            System.out.println(vectors[i].toString());
        }
    }
}
