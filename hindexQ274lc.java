import java.util.Arrays;

public class hindexQ274lc {
    public static int hIndex(int citations[]){
        Arrays.sort(citations);
        int n=citations.length;
        for(int i=0;i<n;i++){
            int h=n-i;
            if(citations[i]>=h){
                return h;
            }
        }
            return 0;
        }
        public static void main(String args[]){
        int citations[]={3,0,6,1,5};
        int res=hIndex(citations);
        System.out.println(res);
    }
}
    
