public class removeduplicate2 {
    public static int removeDuplicate(int nums[]){
        if(nums.length<=2){
            return nums.length;
        }
        int k=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[k-2]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }

public static void main(String args[]){
    int nums[]={1,1,1,2,2,3};
    int k = removeDuplicate(nums);
    System.out.println("The new length of the array is: "+k);
}
}