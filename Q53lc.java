public class Q53lc {
    public static int maximumSubarray(int nums[]){
        int curr=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(nums[i],curr+nums[i]);
            maxsum=Math.max(curr,maxsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubarray(nums));
    }
}
