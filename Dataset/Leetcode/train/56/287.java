 class Solution {
    public int[][] XXX(int[][] intervals) {
        int n = intervals.length;
        if (n == 1) return intervals;
        int[][] XXX = new int[n][];
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        XXX[0] = intervals[0];
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] > XXX[j][1])
                XXX[++j] = intervals[i];
            else
                XXX[j][1] = Math.max(intervals[i][1], XXX[j][1]);
          }
        return Arrays.copyOf(XXX, j+1);
    }
}

