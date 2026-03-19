public class solution {
    public static int secondsmallest(int nums[]){
        if(nums.length<2){
            return-1;
        }
        int small=Integer.MAX_VALUE;
        int second_smallest =Integer.MAX_VALUE;

        for(int i = 0;i<nums.length ;i++){
            if(nums[i]<small){
                second_smallest=small;
                small=nums[i];
            }
            else if(nums[i]<second_smallest && nums[i]!=small){
                second_smallest=nums[i];
            }
        }
        return second_smallest;
    }
    public static int secondlargest(int nums[]){
        if(nums.length<2){
            return-1;
        }
            int largest=Integer.MIN_VALUE;
            int second_largest=Integer.MIN_VALUE;

            for(int i=0;i<nums.length;i++){
                if(nums[i]>largest){
                second_largest=largest;
                largest=nums[i];
            }
            else if(nums[i]>second_largest && nums[i]!=largest){
                second_largest=nums[i];
            }
        }
        return second_largest;
    }
public static void main(String args[]){
            int nums[]={3,6,9,8,5,4};
            System.out.println(secondlargest(nums));
            System.out.println(secondsmallest(nums));
        }
 }
