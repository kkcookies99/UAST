 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3=new int[m];
        for(int i=0;i<m;i++){
            nums3[i]=nums1[i];
        }
        int j=0,k=0;
        for(int i=0;i<m+n;i++){
            if(j<m&&k<n){
            if(nums3[j]<=nums2[k]){
                nums1[i]=nums3[j++];
               }else{
                nums1[i]=nums2[k++];
              }
            }else if(j>=m){
                nums1[i]=nums2[k++];
            }else if(k>=n){
                nums1[i]=nums3[j++];
            }        
        }
     }          
    }


