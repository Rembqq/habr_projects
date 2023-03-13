public class Task_1_0 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int max = arr[0], min = 9, aver, sum = 0;

        for(int i = 0; i < arr.length; ++i)
        {
            arr[i] = (int)(Math.random() * 10);
            System.out.print(arr[i] + " ");
            sum += arr[i];
            if(arr[i] > max)
            {
                max = arr[i];
            }
            else if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        aver = sum / arr.length;
        System.out.println("Average is " + aver +
                          "\nMinimum is " + min +
                          "\nMaximum is " + max);
    }
}