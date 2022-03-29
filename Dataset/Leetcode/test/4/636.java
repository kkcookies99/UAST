 public double XXX(int[] nums1, int[] nums2) {
        //归并排序
        int n = nums1.length;
        int m = nums2.length;
        int L = n + m;
        int[] res = new int[L];
        int index = 0;
        int i = 0, j = 0;
        while (index < L) {
            if (i == n) {
                while (j < m) {
                    res[index] = nums2[j];
                    index++;
                    j++;
                }
                break;
            }
            if (j == m) {
                while (i < n) {
                    res[index] = nums1[i];
                    index++;
                    i++;
                }
                break;
            }
            if (nums1[i] <= nums2[j]) {
                res[index] = nums1[i];
                i++;
                index++;
            } else {
                res[index] = nums2[j];
                j++;
                index++;
            }

        }
        if (L % 2 == 0) {
            int mid = L / 2;
            return (double) (res[mid] + res[mid - 1]) / 2;
        } else {
            int mid = L / 2;
            return res[mid];
        }
    }

