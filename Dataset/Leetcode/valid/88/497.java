 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        for(int j=nums1.length-1,i=m-1;i>=0;i--,j--){
            nums1[j]=nums1[i];
        }
        int i=n,j=0,k=0;
        while(i<m+n||j<n){
            if(i<m+n&&j<n){
                if(nums1[i]<=nums2[j]){
                    nums1[k++]=nums1[i++];
                }else{
                    nums1[k++]=nums2[j++];
                }
            }else if(i<m+n){
                nums1[k++]=nums1[i++];
            }else{
                nums1[k++]=nums2[j++];
            }
        }
    }
}

