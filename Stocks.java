public class Stocks {
    public static int buyAndSell(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            int todayPrice = prices[i];
            if(todayPrice > buyPrice){
                int  Profit = todayPrice - buyPrice;
                maxProfit = Math.max(maxProfit, Profit);
            }else{
                buyPrice = todayPrice;
             
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Your maximum profit is: " + buyAndSell(prices));
    }
}
