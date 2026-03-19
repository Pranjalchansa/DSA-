import java.util.Scanner;

public class CountBinaryDigit{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int count0 = 0, count1 = 0;
            System.out.print("Enter a binary string: ");
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '0') {
                    count0++;
                } else if (ch == '1') {
                    count1++;
                }
            }   System.out.println("Number of 0's: " + count0);
            System.out.println("Number of 1's: " + count1);
        }
    }
}
