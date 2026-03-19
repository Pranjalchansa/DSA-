public class buysellprofit {
    public static int profit(int prices[]){
        int n=prices.length;
        int profit=0;
        for(int i=1;i<n;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int maxprofit=profit(prices);
        System.out.println("The maximum profit is : "+maxprofit);
    }
}
