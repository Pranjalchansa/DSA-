public class removeelement {
    public static int removeElemnt(int nums[],int val){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }

public static void main(String args[]){
    int nums[]={3,2,2,3};
    int val=3;
    int k = removeElemnt(nums,val);
    System.out.println("The new length of the array is: " + k);
}
}
