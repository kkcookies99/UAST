 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
       int i=0,j=0,k=0;
       while(i<m&&j<n) {
           if(nums1[i]<=nums2[j]){
               nums1[k]=nums1[i];
               i++;k++;
           }else{
               nums1[k]=nums2[j];
               j++;k++;
           }
       } 
       while(i<m){
           nums1[k]=nums1[i];
               i++;k++;
       }  
       while(j<n){
           nums1[k]=nums2[j];
               j++;k++;
       }
    }
}

