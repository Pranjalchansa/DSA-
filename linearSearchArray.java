public class linearSearchArray {
    public static int linearSearch(int numbers[],int key){
        for (int i = 0 ; i< numbers.length ; i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] ={24,77,89,12,45,67,87};
        int key = 67;

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("key is at index : "+index);
        }
    }
}
