
import java.util.Scanner;

public class functiontomultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int mul = muloftwonum(a,b);
        System.out.println(mul);
    }

    public static int muloftwonum(int a, int b)
    {
        int mul = a*b;
        return mul;

    }
}
