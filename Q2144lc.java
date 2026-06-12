import java.util.Arrays;
public class Q2144lc {
    
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int total = 0;
        int count = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            count++;
            if (count == 3) {
                count = 0; 
                continue;
            }
            total += cost[i];
        }
        return total;
    }
public static void main(String[] args) {
    Q2144lc solution = new Q2144lc();
    int[] cost = {1, 2, 3};
    System.out.println(solution.minimumCost(cost)); 
}
}