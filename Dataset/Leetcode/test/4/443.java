 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (n < m) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
            int tmp = m;
            m = n;
            n = tmp;
        }
        if (m == 0) {
            return n % 2 == 1 ? nums2[n / 2] : (nums2[n / 2] + nums2[n / 2 - 1]) / 2.0;
        }
        int low = 0;
        int high = m;
        while (low <= high){
            int i = (low + high) >> 1;
            int j = (m + n) / 2 - i;
            int leftA = i == 0 ? Integer.MIN_VALUE : nums1[i - 1];
            int rightA = i == m ? Integer.MAX_VALUE : nums1[i];
            int leftB = j == 0 ? Integer.MIN_VALUE : nums2[j - 1];
            int rightB = j == n ? Integer.MAX_VALUE : nums2[j];
//            A[i-1] <= B[j] && B[j-1] <= A[i]
            if(leftA <= rightB && leftB <= rightA){
                if ((m + n) % 2 == 0) {
                    return (Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2.0;
                }
                return Math.min(rightA, rightB);
            }
//            A[i-1] > B[j] , 说明i的值有点大，要缩小范围
            if(leftA > rightB){
                high = i-1;
            }
//            B[j-1] > A[i]，说明i的值有点小，要增大范围
            if(leftB > rightA){
                low = i+1;
            }
        }
        return 0.0;
    }
}

