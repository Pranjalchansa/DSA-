public class buysell {
    public static int buySell(int prices[]){
        int n=prices.length;
        int min=prices[0];
        int max=0;
        int profit=0;
        for(int i=1;i<n;i++){
            min=Math.min(min,prices[i]);
            max=Math.max(max,prices[i]);
            profit=Math.max(profit,max-min);
        }
        System.out.println("The minimum price is: "+min);
        System.out.println("The maximum price is: "+max);
        System.out.println("The maximum profit is: "+profit);
        return profit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        buySell(prices);
    }
}
