public class minSizeSubArraySumQ209Lc {
    public static int minSubArrayLen(int target,int nums[]){
        int left=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        for(int right=0;right<n;right++){
            sum=sum+nums[right];
            while(sum>=target){
                min=Math.min(min,right-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
    public static void main(String args[]){
        int target=7;
        int nums[]={2,3,1,2,4,3};
        int res=minSubArrayLen(target, nums);
        System.out.println(res);
    }
}