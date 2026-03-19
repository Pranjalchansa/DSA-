public class dailybuysellprofit {
    public static int profit(int price[]){
        int minprice = price[0];
        int maxprice = 0;

        for (int i = 1 ; i<price.length ; i++){
            if(price[i] < minprice){
                minprice = price[i];
            }
            else{
                int profit = price[i] - minprice;
                maxprice = Math.max(maxprice,profit); 
            }
        }
        return maxprice;
    }
    public static void main(String[] args) {
        int price []={7,8,5,9,1,3}; 
        int result = profit(price);
        System.out.println("Maxinmum profit :"+result);
    }
    
}
