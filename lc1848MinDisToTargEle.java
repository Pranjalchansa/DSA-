public class lc1848MinDisToTargEle {
    public static int getMinDistance(int nums[],int target,int start){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                int dis=Math.abs(i-start);
                min=Math.min(min,dis);
            }
        }
        return min;
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,5};
        int target=5;
        int start=3;
        System.out.println(getMinDistance(nums,target,start));

    }
}
