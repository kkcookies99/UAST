 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return;
        for(int i=m+n-1;i>=0&&n>0;i--){
            if(m==0 ||nums2[n-1]>=nums1[m-1])  nums1[i] = nums2[n-- -1];
            else nums1[i] = nums1[m-- -1];           
        }
    }
}

