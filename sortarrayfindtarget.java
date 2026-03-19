public class sortarrayfindtarget {

    public static int search(int numbers[], int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                return mid;
            }

            if (numbers[left] <= numbers[mid]) {
                if (numbers[left] <= target && target < numbers[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (numbers[mid] < target && target <= numbers[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int result = search(numbers, target);
        System.out.println("Target found at index: " + result);
    }
}
