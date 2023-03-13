package Basics;

public class Task_1_2 {
    public static void main(String[] args) {
        //1st method
        boolean isPrime;
        for(int i = 2; i <= 100; ++i)
        {
            isPrime = true;
            for(int j = 2; j <= Math.sqrt(i); ++j)
            {
                if(i % j == 0)
                {
                    isPrime = false;
                }
            }
            if(isPrime)
            {
                System.out.print(i + " ");
            }
        }
        //2nd method
        /*out_for:
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    continue out_for;
                }
            }
            System.out.println(i);
        }*/
    }
}
