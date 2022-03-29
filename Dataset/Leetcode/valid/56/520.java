 class Solution {
    public int[][] XXX(int[][] intervals) {
        /*
        区间[s1, e1]和[s2, e2]不相交条件为:e1 < s2 || e2 < s1
        */
        if(intervals == null || intervals.length == 0){
            return intervals;
        }
        int[][] newIntervals = new int[1][2];
        newIntervals[0] = intervals[0];
        for(int i = 1; i < intervals.length;i++){
            newIntervals = XXXIdx(newIntervals, intervals[i]);
        }
        return newIntervals;
    }

    public int[][] XXXIdx(int[][] intervals, int[] pre){
        int[][] newIntervals = new int[intervals.length + 1][2];
        int count = 0;
        for(int[] nums : intervals){
            if(nums[1] < pre[0] || pre[1] < nums[0]){
                newIntervals[count++] = nums;
                continue;
            }
            pre[0] = Math.min(pre[0], nums[0]);
            pre[1] = Math.max(pre[1], nums[1]);
        }
        newIntervals[count++] = pre;
        return Arrays.copyOf(newIntervals, count);  // 截断返回
    }
}

