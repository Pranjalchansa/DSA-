
import java.util.Scanner;

public class MaxSubArraySum {
    public static void MaxSumOfSubArray(int numbers[])
    {
        int currsum;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0 ; i < numbers.length ; i ++){
            int start = i ;
            for(int j = i ; j < numbers.length ; j++){
                int end = j; 
                currsum = 0 ;
                for (int k = start ; k <= end ; k++){
                    currsum = currsum + numbers[k];
                    if (currsum > maxsum) {
                      maxsum = currsum;
                    }

                }
                System.out.println("curr sum of an subarray is : "+ currsum);
            }
            System.out.println("max sum of array is : "+ maxsum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i = 0 ; i < size ; i++){
            numbers[i] = sc.nextInt();
        }

        MaxSumOfSubArray(numbers);
    }
}
