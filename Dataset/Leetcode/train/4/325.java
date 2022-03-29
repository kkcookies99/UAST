 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int half = (n + m) / 2;
        int start = 0;
        int end = half;
        do {
            int k = (start + end) / 2;
            int v = half - k;
            
            // 存在一个数组数量太少时，需要调小参数
            if(n < k) {
                end = k - 1;
                continue;
            }
            if(m < v) {
                start = k + 1;
                continue;
            }

            if(!(k == 0 || v+1 > m || nums1[k-1]<=nums2[v])){
                end = k - 1;
                continue;
            }

            if(!(v == 0 || k+1 > n || nums2[v-1]<=nums1[k])){
                start = k + 1;
                continue;
            }

            int size = n + m;
            if(size % 2 == 1){
                if(k==n){
                    return nums2[v];
                }
                if(v==m){
                    return nums1[k];
                }
                return Math.min(nums2[v],nums1[k]);
            } else {
                if(size == 0) {
                    return 0;
                }

                int max = 0;
                if(k==n) {
                    max = nums2[v];
                } else if(v==m) {
                    max = nums1[k];
                } else {
                    max = Math.min(nums2[v],nums1[k]);
                }

                int min = 0;
                if(k == 0){
                    min = nums2[v-1];
                } else if(v == 0) {
                    min = nums1[k-1];
                }else{
                    min = Math.max(nums2[v-1],nums1[k-1]);
                }

                return (new Double(max) + new Double(min))/2;
            }
        } while(start <= end);
        return 0;
    }
}

