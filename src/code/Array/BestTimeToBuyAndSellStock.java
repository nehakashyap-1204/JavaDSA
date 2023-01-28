package code.Array;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit2(prices));

    }
    public static int maxProfit(int[] prices) {

        int max=0,min=prices[0];
        for(int i=1;i<prices.length;i++)   {

            if(min<prices[i])
                max=Math.max(prices[i]-min,max);
            else
                min=prices[i];
        }
        return max;
    }

    public static int maxProfit2(int[] prices) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < prices.length -1; i++){
            count = count + (prices[i+1] - prices[i]);
            if (count < 0){
                count = 0;
            }
            if (count >= 0 && count >= max){
                max = count;
            }
        }
        return max;
    }
}
