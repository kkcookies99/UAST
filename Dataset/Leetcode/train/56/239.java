 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });
        int left = intervals[0][0], right = intervals[0][1];
        List<int[]> list = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            if (left <= intervals[i][0] && intervals[i][1] <= right) {
                // 覆盖
                continue;
            } else if (intervals[i][0] <= right && right <= intervals[i][1]) {
                // 相交
                right = intervals[i][1];
            } else {
                // 无交点
                list.add(new int[]{left, right});
                left = intervals[i][0];
                right = intervals[i][1];
            }
        }
        list.add(new int[]{left, right});
        return list.toArray(new int[list.size()][2]);
    }
}

