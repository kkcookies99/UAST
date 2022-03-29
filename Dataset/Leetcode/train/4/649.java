 class Solution {
    public double XXX(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        // 分别找第 (m+n+1) / 2 个，和 (m+n+2) / 2 个，然后求其平均值, 可忽略数组总长度的奇偶性
        int l = find(nums1, 0, nums2, 0, (n + m + 1) / 2);
        int r = find(nums1, 0, nums2, 0, (n + m + 2) / 2);
        return (double)(l + r) / 2.0;
    }

    // 递归找两个有序数组的第 k 个数 , i 、j 分别表示对应数组起始位置
    private int find(int[] nums1, int i, int[] nums2, int j, int k){
        int n = nums1.length;
        int m = nums2.length;
        if(m > n){
            // 使 nums1 总比 nums2 长 ，方便后续处理
            return find(nums2, j, nums1, i, k);
        }
        // 某一个数组为空的情况
        if(m == j){
            return nums1[i + k - 1];
        }
        if(n == i){
            return nums2[j + k - 1];
        }
        // 约束条件
        if(k == 1){
            return Math.min(nums1[i], nums2[j]);
        }

        // sj 如果直接等于 j + k / 2 ，较短的数组可能会越界
        int si = i + k / 2 , sj = Math.min(m, j + k / 2);
        if(nums1[si - 1] < nums2[sj - 1]){
            return find(nums1, si, nums2, j, k - k / 2);
        }else{
            return find(nums1, i, nums2, sj, k - (sj - j));
        }
    }
}




