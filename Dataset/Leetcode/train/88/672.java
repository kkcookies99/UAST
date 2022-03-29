 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];
        int indexLeft = 0;
        int indexRight = 0;
        if (nums1.length == 0 && nums2.length == 0) return;
        if (nums1.length == 0) {
            for (int i = 0; i != m + n; ++i) {
                nums1[i] = nums2[i];
            }
            return;
        }
        if (nums2.length == 0) return;
        for (int i = 0; i < m + n; i++) {
            //小数组会超出数组下标，特殊处理一下
            if (indexRight >= n) {
                arr[i] = nums1[indexLeft];
                indexLeft++;
                continue;
            }
            if (nums1[indexLeft] > nums2[indexRight]) {
                if (indexRight < n) {
                    arr[i] = nums2[indexRight];
                    indexRight++;
                } else {
                    //超出边界就反着放
                    arr[i] = nums1[indexLeft];
                    indexLeft++;
                }

            } else {
                if (indexLeft < m) {
                    arr[i] = nums1[indexLeft];
                    indexLeft++;
                } else {
                    //超出边界就反着放
                    arr[i] = nums2[indexRight];
                    indexRight++;
                }

            }
        }
        for (int i = 0; i != m + n; ++i) {
            nums1[i] = arr[i];
        }
    }
}

