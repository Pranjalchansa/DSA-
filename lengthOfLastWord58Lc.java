public class lengthOfLastWord58Lc {
    public static int lengthOfLast(String s){
        s=s.trim();
        int lastSpace=s.lastIndexOf(" ");
        String lastWord=s.substring(lastSpace+1);
        return lastWord.length();
    }
    public static void main(String args[]){
        String s="Hello World";
        System.out.println(lengthOfLast(s));
    }
}
