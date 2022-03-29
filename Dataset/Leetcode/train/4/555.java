  class Solution {
        public double XXX(int[] nums1, int[] nums2) {
            int n = nums1 == null ? 0 : nums1.length;
            int m = nums2 == null ? 0 : nums2.length;
            if (n == 0 && m == 0) {
                return 0;
            }
            //计算中位数位置
            int akIndex = (n + m) / 2;
            int a = 0, b = 0;
            int ak = 0, pre = 0;
            for (int i = 0; i <= akIndex; i++) {
                if (i == akIndex) {
                    //最后一轮保存记录下上一个数据
                    pre = ak;
                }
                //假设nums1数组更长,那么需不断地推进nums1的下标a; else情况下推进nums2下标b
                if (a < n && (b >= m || nums1[a] <= nums2[b])) {
                    ak = nums1[a];
                    a ++;
                } else if (b < m) {
                    ak = nums2[b];
                    b ++;
                }
            }
            // 奇数/偶数不同的方式进行计算
            return (n + m) % 2 == 0 ? (ak + pre) * 1.0D / 2 : ak;
        }
    }


