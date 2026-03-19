public class sumofsubpairs {
    public static void sumofSubPairs(int numbers[]){
        int sum = 0;
        for(int i = 0 ; i<numbers.length ; i++){
            int start = i;
            for (int j=i ; j <numbers.length ; j++ ){
                int end = j;
                sum = 0;
                for (int k = start ; k<=end ; k++){
                    sum = sum + numbers[k];
                }
                System.out.println("sum of an pair of subArray is : "+ sum);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        sumofSubPairs(numbers);
    }
}
