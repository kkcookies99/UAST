 class Solution {
    public int[][] XXX(int[][] intervals) {
        if (intervals == null || intervals.length < 2)
            return intervals;
        Arrays.sort(intervals, (ar1, ar2) -> ar1[0] - ar2[0]);
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; ) {
            int end = intervals[i][1];
            int j = i + 1;
            // 往后找到第一个区间不重叠的就跳出循环
            for (; j < intervals.length && intervals[j][0] <= end; j++) {
                end = Math.max(end, intervals[j][1]);
            }
            list.add(new int[]{intervals[i][0], end});
            i = j;
        }
        int[][] ans=  new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}

