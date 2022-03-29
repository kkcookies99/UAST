 public int[][] XXX(int[][] intervals) {
    if (intervals == null || intervals.length == 0) {
        return intervals;
    }
    // 策略：按照区间的 start 升序排列
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    List<int[]> result = new ArrayList<>();
    int x_start = intervals[0][0];
    int x_end = intervals[0][1];
    for (int[] interval : intervals) {
        if (x_start <= interval[0] && interval[0] <= x_end) {
            // 当前的 start 属于区间覆盖范围，更新 end 为更大的值
            x_end = Math.max(x_end, interval[1]);
        } else {
            // 当前的 start 不属于区间覆盖范围，新起一个区间
            result.add(new int[] {x_start, x_end});
            x_start = interval[0];
            x_end = interval[1];
        }
    }
    // 把最后一个区间加入到结果中
    result.add(new int[] {x_start, x_end});
    return result.toArray(new int[result.size()][2]);
}

