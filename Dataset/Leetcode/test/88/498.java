 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        if (m==0){
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        int j = 0;
        for (int i = m ; i < nums1.length; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
}

