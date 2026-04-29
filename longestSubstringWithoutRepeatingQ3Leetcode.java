import java.util.*;
public class longestSubstringWithoutRepeatingQ3Leetcode {
    public static int lengthOfLongestSubstring(String s){
        int n=s.length();
        int left=0;
        int right=0;
        int maxLength=0;
        HashSet<Character>set=new HashSet<>();
    while(right<n){
        if(!set.contains(s.charAt(right))){
            set.add(s.charAt(right));
            maxLength=Math.max(maxLength,right-left+1);
            right++;
        }else{
            set.remove(s.charAt(left));
            left++;
        }
    }    
return maxLength;
}
public static void main(String args[]){
    String s="abcabcbb";
    int res=lengthOfLongestSubstring(s);
    System.out.println(res);
}
}
