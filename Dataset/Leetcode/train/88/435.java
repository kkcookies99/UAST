 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<nums2.length;++i){
            for(int j=0;j<nums1.length;++j){
                if(nums1[j]==0 && j>=(m+i)){
                    int t = nums1[j];
                    nums1[j] = nums2[i];
                    nums2[i] = t;
                    break;
                }
                if(nums1[j] > nums2[i]){
                    int t = nums1[j];
                    nums1[j] = nums2[i];
                    nums2[i] = t;
                }
            }
        }
    }
}

