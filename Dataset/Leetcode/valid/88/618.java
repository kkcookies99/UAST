 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int cur = nums1.length;
        for(int i=m-1, j=n-1; i>=0||j>=0; ){
            cur--;
            if(i<0){
                nums1[cur] = nums2[j];
                j--;
                continue;
            }
            if(j<0){
                nums1[cur] = nums1[i];
                i--;
                continue;
            }
            if(nums1[i]>=nums2[j]){
                nums1[cur] = nums1[i];
                i--;
            }else{
                nums1[cur] = nums2[j];
                j--;
            }
        }
    }
}

