 class Solution {
    public int[][] XXX(int[][] intervals) {
        if (intervals == null || intervals.length < 1) return null;
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int i = 0, n = intervals.length;
        while (i < n) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            while (i < n - 1 && intervals[i + 1][0] <= right) {
                right = Math.max(right, intervals[i + 1][1]);
                i++;
            }
            list.add(new int[]{left, right});
            i++;
        }
        return list.toArray(new int[list.size()][2]);
    }
}

