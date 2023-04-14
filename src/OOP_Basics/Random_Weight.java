package OOP_Basics;

public class Random_Weight {
    //creating fields
    private final int[] val;
    private final int[] weight;
    //constructor
    public Random_Weight(int[] _val, int[] _weight)
    {
        val = _val;
        weight = _weight;
    }
    //Random num calculator
    public int getNum() {
        int r_num, overall_weight = 0;
        // counting random num range(max weight)
        for(int i = 0; i < weight.length; ++i)
        {
            overall_weight += weight[i];
        }
        r_num = (int)(Math.random() * overall_weight + 1);
        System.out.println("Random token: " + r_num);
        int current_weight = 0;
        //comparing random num to that weight(counter) where it outranged overall_weight
        for(int i = 0; i < weight.length; ++i)
        {
            current_weight += weight[i];
            if(current_weight >= r_num)
            {
                System.out.print("Random num: ");
                return val[i];
            }
        }
        return -1;
    }
}
