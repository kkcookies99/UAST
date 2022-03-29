 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int nums1Index = 0, nums2Index = 0;
        int index = 0;
        int[] res = new int[nums1.length];
        while(nums2Index<n && nums1Index<m){
            if(nums1[nums1Index]>=nums2[nums2Index]) res[index++] = nums2[nums2Index++];
            else res[index++] = nums1[nums1Index++];
        }
        for( ; nums1Index<m; nums1Index++){
            res[index++] = nums1[nums1Index];
        }
        for( ; nums2Index<n; nums2Index++){
            res[index++] = nums2[nums2Index];
        }
        for(int i=0; i<res.length; i++){
            nums1[i] = res[i];
        }
    }
}

