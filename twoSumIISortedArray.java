public class twoSumIISortedArray {
    public static int[] twoSum(int[]numbers , int target ){
        int left=0;
        int right=numbers.length-1;
        int k=0;
        while(left<right){
            k=numbers[left]+numbers[right];
            if(k==target){
                return new int[]{left+1,right+1};
            }else if(k<target){
                left++;
            }else{
                right--;
            }
    }
    return new int[]{-1,-1};
 } 
    public static void main(String args[]){
        int numbers[]={2,7,11,15};
        int target=9;
        int res[]=twoSum(numbers, target);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }  
}
