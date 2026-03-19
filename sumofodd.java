public class sumofodd {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};
        int r = 2;
        rotateRight(arr, r);
        System.out.print("Rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    static void rotateRight(int[] arr, int r) {
        int n = arr.length;
        r = r % n;  
        reverse(arr, 0, n - 1);
        reverse(arr, 0, r - 1);
        reverse(arr, r, n - 1);
    }
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
