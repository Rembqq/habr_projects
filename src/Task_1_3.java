import java.util.Scanner;

public class Task_1_3 {
    public static void main(String[] args) {
        int[] xarr = new int[10];

        int offset = 0;
        // initializing the array
        for(int i = 0; i < xarr.length; ++i)
        {
            xarr[i] = (int)(Math.random() * 10);
            System.out.print(xarr[i] + " ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int del_num = scanner.nextInt();
        // 1.0 replacing del_num
        for(int i = 0; i < xarr.length; ++i)
        {
            if(xarr[i] == del_num)
            {
                offset++;
            }
            else
            {
                xarr[i - offset] = xarr[i];
            }
        }
        // 1.1 deleting the "tail"
        int[] sortedXarr = new int[xarr.length - offset];
        for(int i = 0; i < sortedXarr.length; ++i)
        {
            sortedXarr[i] = xarr[i];
        }
        // sorted output
        for(int i = 0; i < sortedXarr.length; ++i)
        {
            System.out.print(sortedXarr[i] + " ");
        }
    }
}
