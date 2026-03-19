import java.util.*;
public class maxSubArrayUsingPrefixSum {
    public static void maxSumOfarrayUsingPrefixSum(int numbers[]){
        int currsum ; 
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        for (int i=1 ; i<prefix.length ; i++){
            prefix[i]= prefix[i-1] + numbers[i];
        }
        for (int i = 0 ; i < numbers.length ; i++){
            int start = i ;
            for( int j = i ; j< numbers.length ; j++){
            int end = j;
            currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1]; 
            if (maxsum < currsum){
                maxsum = currsum;
            }
        }
        
    }
        System.out.println("max sum = " + maxsum);
    }

    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[]= new int[size];
        
        for (int i=0 ; i < size ; i++){
            numbers[i] = sc.nextInt();
        }
        maxSumOfarrayUsingPrefixSum(numbers);
        
    }
}
