
import java.util.Scanner;

public class maxsubarrayUsingKadanes {
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
       for (int i = 0 ; i < numbers.length ; i++){
        cs = cs + numbers[i];
        if (cs < 0){
            cs = 0;
        }
        ms = Math.max(cs, ms);
    }
    System.out.println("max subarray sum is : " + ms);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0 ; i < size; i++){
            numbers[i] = sc.nextInt();
        }
        kadanes(numbers);
    }
}
