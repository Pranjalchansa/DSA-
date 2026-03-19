public class twicenumber{
    public static boolean twice(int nums[]){
        boolean duplicate = false;
        for(int i = 0 ; i<nums.length ; i++){
            for(int j = i+1 ;j<nums.length ; j++){
                if(nums[i]== nums[j]){
                    System.out.println(nums[i] + " " );
                    duplicate = true;
            }
        }
    }
            System.out.println();
            return duplicate;
    }
    public static void main(String[] args) {
        int nums[] = {3,2,3,1,1};
        System.out.println(twice(nums));
    }
}