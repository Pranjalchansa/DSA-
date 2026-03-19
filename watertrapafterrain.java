public class watertrapafterrain {
    public static int trap(int height[]) {

        int left = 0;
        int right = height.length - 1;
        int leftmax = 0;
        int rightmax = 0;
        int water = 0;

        while (left < right) {

            if (height[left] < height[right]) {

                if (height[left] >= leftmax) {
                    leftmax = height[left];
                } else {
                    water = water + (leftmax - height[left]);
                }
                left++;

            } else {

                if (height[right] >= rightmax) {
                    rightmax = height[right];
                } else {
                    water = water + (rightmax - height[right]);
                }
                right--;
            }
        }
        return water;
    }
    public static void main(String args[]) {
        int height[] = {0,1,0,2,1,0,1,2,1,3,2,1};
        System.out.println(trap(height));
    }
}

    

