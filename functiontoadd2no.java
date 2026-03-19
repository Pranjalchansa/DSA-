import java.util.*;
public class functiontoadd2no {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int sum = sumoftwonumber(a,b);
    System.out.println(sum);
    }

    public static int sumoftwonumber(int a , int b)
    {
        int sum = a + b;
        return sum;
    }

    
}
