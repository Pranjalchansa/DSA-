public class removeduplicate{
    public static int removeDuplicate(int nums[]){
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;   
            }
        }
        return k;
    }
    public static void main(String args[]){
        int nums[]={2,3,4,4,5,6};
        int removed=nums.length-removeDuplicate(nums);
        System.out.println("removed duplicate count is : "+ removed);
        System.out.println("unique count is : "+ removeDuplicate(nums));
        for(int i=0;i<removeDuplicate(nums);i++){
            System.out.print(nums[i]+" ");
        }
    }
}