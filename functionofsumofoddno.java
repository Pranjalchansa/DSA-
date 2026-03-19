
import java.util.Scanner;

public class functionofsumofoddno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {
            System.out.println("enter value of n:");
            int n = sc.nextInt();
            printSumOfOdd(n);
        }
        
    }
    public static int printSumOfOdd(int n)
    {
        int sum = 0;
        for (int i =1 ; i<=n ; i++)
        {
            if(i % 2 != 0) {
                sum = sum +i;
            }
        }
        System.out.println("sum of all odd numbers frm 1 to "+ n + "is:"+sum);
        return sum;
    }
}
