import java.util.*;
public class majorityelement {
    public static int majorityElement(int nums[]) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static void main(String args[]){
        int nums[]={2,2,1,1,1,2,2};
        int majority=majorityElement(nums);
        System.out.println("the majority element is :"+majority);
    }
}
