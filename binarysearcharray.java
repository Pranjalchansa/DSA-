public class binarysearcharray {
    public static int binarySearch(int[] numbers , int key) {
        int start = 0;
        int end = numbers.length-1;
        while(start <= end){
            int mid = (start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]< key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,4,6,8,9,12,13,24,35,67,88,89};
        int key =9;
        System.out.println("index for key is :" + binarySearch(numbers, key));
    }
}

