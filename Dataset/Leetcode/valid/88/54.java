 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            return;
        }
        if(m==0){
           nums1 = Arrays.copyOf(nums2,n);
        }else {
            for (int i = n - 1; i >= 0; ) {
                nums1[m + i] = nums1[m - 1] > nums2[i] ? nums1[-1 + (m--)] : nums2[i--];
            }
        }
    }
}

