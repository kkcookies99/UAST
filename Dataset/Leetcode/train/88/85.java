 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int sumNum = n + m - 1 ;
        m--;
        n--;
        while (true){
            if (m < 0){
                for (int i = 0; i <= sumNum; i++) {
                    nums1[i] = nums2[i];
                }
                break;
            }
            if (n < 0){
                break;
            }

            nums1[sumNum--] = nums1[m] >= nums2[n] ? nums1[m--] :  nums2[n--];
        }
    }
}

