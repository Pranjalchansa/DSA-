import java.util.*;
public class ransomeNote {
    public static boolean canConstruct(String ransomeNote,String magazine){
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
            
            }
            for(int i=0;i<ransomeNote.length();i++){
                char ch=ransomeNote.charAt(i);
                if(!map.containsKey(ch)||map.get(ch)==0){
                    return false;
                }
                map.put(ch,map.get(ch)-1);
        }
        return true;
    }
    public static void main(String args[]){
        String ransomeNote="aa";
        String magazine="aab";
        boolean res=canConstruct(ransomeNote, magazine);
        System.out.println(res);
    }
}
