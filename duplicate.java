import java.util.*;
public class duplicate {
    public static boolean duplicateNumber(int nums[]){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
return false ;
    }
    public static void main(String args[]){
        int nums[]={1,2,4,3,4,4};
        System.out.println(duplicateNumber(nums));
    }
}
