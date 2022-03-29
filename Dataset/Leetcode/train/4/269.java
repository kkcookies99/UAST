 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length)return XXX(nums2, nums1);
        
        int n1 = nums1.length, n2 = nums2.length;
        int hf = (n1 + n2 + 1) / 2;
        int l = 0, r = n1;
        while(l < r)
        {
            int i = l + (r - l)/2;
            int j = hf - i;
            if(nums2[j-1] > nums1[i])l = i + 1;
            else r = i;
        }

        int i = l + (r - l)/2;
        int j = hf - i;
        int lv1 = (i == 0 ? Integer.MIN_VALUE : nums1[i-1]);
        int lv2 = (j == 0 ? Integer.MIN_VALUE : nums2[j-1]);
        int rv1 = (i == n1 ? Integer.MAX_VALUE : nums1[i]);
        int rv2 = (j == n2 ? Integer.MAX_VALUE : nums2[j]);
        
        if((n1 + n2)%2 == 0)return (Math.min(rv1, rv2) + Math.max(lv1, lv2))/2.0;
        return Math.max(lv1, lv2);
    }
}

