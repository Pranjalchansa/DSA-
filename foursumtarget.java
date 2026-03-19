import java.util.Arrays;

public class foursumtarget {

    public static void fourSum(int[] nums, int target) {

        Arrays.sort(nums); // important step
        int n = nums.length;

        // pick first number
        for (int i = 0; i < n - 3; i++) {

            // pick second number
            for (int j = i + 1; j < n - 2; j++) {

                int left = j + 1;
                int right = n - 1;

                // two pointer for remaining two numbers
                while (left < right) {

                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        System.out.println(
                            nums[i] + " " + nums[j] + " " + nums[left] + " " + nums[right]
                        );
                        left++;
                        right--;
                    }
                    else if (sum < target) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {1, 0, -1, 0, -2, 2};
        int target = 0;

        fourSum(nums, target);
    }
}
