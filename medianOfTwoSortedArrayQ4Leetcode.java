public class medianOfTwoSortedArrayQ4Leetcode {
    public static double  median(int nums1[],int nums2[]){
        int n=nums1.length;
        int m=nums2.length;
        int arr[]=new int [n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
                k++;
            }else{
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k]=nums2[j];
            j++;
            k++;
        }
        int total =n+m;
        int mid=total/2;
        if(total%2==0){
            return (arr[mid]+arr[mid-1])/2.0;
        }
        return arr[mid];
    }
    public static void main(String[] args) {
        int nums1[]={1,2};
        int nums2[]={3,4};
        double res=median(nums1, nums2);
        System.out.println(res);
    }
}
