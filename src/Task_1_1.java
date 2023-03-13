public class Task_1_1 {
    public static void main(String[] args) {
        //initialization
        int[] arr = new int[10];
        int temp;
        for(int i = 0; i < arr.length; ++i) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + " ");
        }
        //sorting
        for(int i = 0; i < arr.length; ++i)
        {
            for(int j = 0; j < arr.length - i - 1; ++j)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        //sorted arr output
        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
