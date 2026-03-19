
public class largestInArray {
    public static int largestValueInArray(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<numbers.length ; i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,40,50,66,78,99,30};
        System.out.println("largest value is : "+ largestValueInArray(numbers));
    }
}
