public class ValidPalindrome {
    public static boolean isPalindrome(String s){
        String Lower=s.toLowerCase();
        String clean=Lower.replaceAll("[^a-z0-9]","");
        int l=0;
        int r=clean.length()-1;
        while(l<r){
            if(clean.charAt(l)!=clean.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String args[]){
        String s="A man a plan a canal Panama";
        System.out.println(isPalindrome(s));
    }
}
