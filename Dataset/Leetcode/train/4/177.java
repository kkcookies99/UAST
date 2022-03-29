     public double XXX3(int[] nums1, int[] nums2) {
        int total_len = nums1.length + nums2.length;
        if (total_len == 0) {
            return 0;
        }
        int mid = total_len / 2;
        if (total_len % 2 == 0) {
            // 偶数情况
            return (getKth(nums1, 0, nums2, 0, mid) + getKth(nums1, 0, nums2, 0, mid + 1)) * 0.5;
        } else {
            // 奇数情况
            return getKth(nums1, 0, nums2, 0, mid + 1);
        }
    }

    private int getKth(int[] nums1, int start1, int[] nums2, int start2, int k) {
        int len1 = nums1.length - start1; // nums1长度
        int len2 = nums2.length - start2; // nums2长度

        // 如果有一个数组长度是0，直接从另一个数组中找第k个数就行了
        if (len1 == 0) {
            return nums2[start2 + k - 1];
        }
        if (len2 == 0) {
            return nums1[start1 + k - 1];
        }
        // 如果k为1，直接返回两个数组的第一个数中较小的就行
        if (k == 1)
            return Math.min(nums1[start1], nums2[start2]);

        // 两个数组中第k/2个数对应的索引，如果数组的长度小于k/2，直接取数组的最后一个元素
        int index1 = start1 + Math.min(len1, k / 2) - 1;
        int index2 = start2 + Math.min(len2, k / 2) - 1;

        if (nums1[index1] < nums2[index2]) {
            // 如果nums1[index1] < nums2[index2]，可以排除掉nums1的index1及之前的数
            // 同时，求解第k小的数也就变成了求解第k - (index1 - start1 + 1)小的数
            return getKth(nums1, index1 + 1, nums2, start2, k - (index1 - start1 + 1));
        } else {
            return getKth(nums1, start1, nums2, index2 + 1, k - (index2 - start2 + 1));
        }
    }

