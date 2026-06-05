import java.util.HashSet;

class Q3lc {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int left = 0;
        int right = 0;
        int maxLength = 0;

        HashSet<Character> set = new HashSet<>();

        while (right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));

                maxLength = Math.max(maxLength, right - left + 1);

                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        Q3lc solution = new Q3lc();
        String input = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}