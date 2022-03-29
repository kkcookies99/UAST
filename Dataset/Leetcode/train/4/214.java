class Solution {
    int n1, n2;
    // l1:表示nums1[0..(l1-1)]已被丢弃；l2同理。
    public int getKth(int[] nums1, int[] nums2, int l1, int l2, int k){
        // 2.1 其中一个数组为空，则直接输出另一个数组的第k小
        if (l1>=n1) return nums2[l2+k-1];
        if (l2>=n2) return nums1[l1+k-1];
        // 2.2 如果k=1，则返回nums1和nums2第一个元素中较小的那个
        if (k==1) return nums1[l1]<=nums2[l2]? nums1[l1]: nums2[l2];
        // 2.3 选取nums1的前k1个元素，nums2的前k2个元素
        int k1 = k>>1, k2 = k>>1;
        // 2.4 如果数组越界，则选取该数组所有元素
        if (k1>=n1-l1) k1 = n1-l1;
        if (k2>=n2-l2) k2 = n2-l2;
        // 2.5 丢弃nums1的k1个元素, 也就是丢弃nums1[l1..(l1+k1-1)]
        if (nums1[l1+k1-1]<=nums2[l2+k2-1]) return getKth(nums1, nums2, l1+k1, l2, k-k1);
        // 2.6 丢弃nums2的k2个元素, 也就是丢弃nums1[l2..(l2+k2-1)]
        else return getKth(nums1, nums2, l1, l2+k2, k-k2);
    }

    public double XXX(int[] nums1, int[] nums2) {
        n1 = nums1.length;
        n2 = nums2.length;
        int n = n1+n2;
        // 1 数组一个为空的情况，直接返回另一个数组的中位数
        if (n1 == 0) return (n2&1)==1? nums2[n2>>1]: (nums2[(n2>>1)-1]+nums2[n2>>1])*0.5;
        if (n2 == 0) return (n1&1)==1? nums1[n1>>1]: (nums1[(n1>>1)-1]+nums1[n1>>1])*0.5;
        // 2 分为总长度为奇数、长度为偶数的情况
        if ((n&1)==1) return getKth(nums1, nums2, 0, 0, (n>>1)+1);
        else {
            return (getKth(nums1, nums2, 0, 0, n>>1)+getKth(nums1, nums2, 0, 0, (n>>1)+1))*0.5;
        }
    }
}

