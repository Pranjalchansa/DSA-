import java.util.Arrays;
public class lc1984kscore {
    public static int minDifference(int nums[],int k){
if(nums.length==1){
    return 0;
}
int midDiff=Integer.MAX_VALUE;
Arrays.sort(nums);
for(int i=0;i<nums.length-k;i++){
    int diff=nums[i+k-1]-nums[i];
    midDiff=Math.min(midDiff,diff);
}
return midDiff;
}
public static void main(String args[]){
    int nums[]={9,4,1,7};
    int k=2;
    System.out.println(minDifference(nums,k));
}
}