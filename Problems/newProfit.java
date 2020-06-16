package Problems;

public class newProfit {
    public static void main(String args[])
    {
        int [] arrTest = {7,1,5,3,6,4};
    }

    public int maxProfit(int[] prices) 
    {
        int money = 0;
        for(int i = 0 ; i < prices.length - 1; i++)
        {
            if(prices[i] < prices[i+1])
            {
                money += prices[i+1] - prices[i];
            }
        }
        return money;
    }
}