class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });
        int[][] ans = new int[intervals.length][2];
        int idx = -1;
        int i = 0;
        while(i < intervals.length) {
            if (i == 0 || intervals[i][0] > ans[idx][1]) {
                ans[++idx] = intervals[i++];
            } else {
                ans[idx][1] = Math.max(ans[idx][1], intervals[i++][1]);
            }
        }
        return Arrays.copyOf(ans, idx + 1);
    }
}

