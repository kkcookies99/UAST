class Solution {
    public int[][] XXX(int[][] intervals) {
         if (intervals.length <= 1) return intervals;
        // 标记合并了多少个数组
        int flag = 0;
        for (int i=0;i<intervals.length;i++) {
            for (int j=i+1;j<intervals.length;j++) {
                XXXTwo(intervals[i], intervals[j]);
                if (intervals[i][0] == -1) {
                    flag++;
                    break;
                }
            }
        }
        // 将有效对数组挑选出来（即起始值未被标记为-1对数组）
        int[][] ans = new int[intervals.length - flag][];
        int index = 0;
        for (int[] t:intervals) {
            if (t[0] != -1)
                ans[index++] = t;
        }
        return ans;
    }
    // 对两个数组进行合并，并将合并后的内容放置第二个数组中，第一个数组第一位置-1，表明已经合并过
    private void XXXTwo(int[] nums1, int[] nums2) {
        if (nums1[0] <= nums2[0] && nums1[1] >= nums2[0]) {
            nums2[0] = nums1[0];
            nums2[1] = Math.max(nums1[1], nums2[1]);
            nums1[0] = -1;
        }
        if (nums2[0] <= nums1[0] && nums2[1] >= nums1[0]) {
            nums2[1] = Math.max(nums2[1], nums1[1]);
            nums1[0] = -1;
        }
    }
}

