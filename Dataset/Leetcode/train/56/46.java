class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) ->  o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1]);
        int i = 0, j = 0;
        while (++j < intervals.length) {
            if (intervals[i][1] >= intervals[j][0]) {
                intervals[i][1] = Math.max(intervals[i][1], intervals[j][1]);
            } else {
                intervals[++i] = intervals[j];
            }
        }
        return intervals.length > 0 ? Arrays.copyOf(intervals, i + 1) : new int[0][0];
    }
}

