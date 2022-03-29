 public int[][] XXX(int[][] intervals) {
    Arrays.sort(intervals,new Comparator<int[]>(){
        @Override
        public int compare(int[] o1, int[] o2) {
            return o1[0] - o2[0];
        }
    });
    int[][] res = new int[intervals.length][2];
    res[0] = intervals[0];
    if (intervals.length == 1) return res;
    int j = 0;
    for (int i = 1; i < intervals.length; i++) {

        if (intervals[i][0] < res[j][1] && intervals[i][1] > res[j][1] || intervals[i][0] == res[j][1]) {
            res[j] = new int[] {res[j][0], intervals[i][1]};
        } else if (intervals[i][0] > res[j][1]) {
            res[++j] = intervals[i];
        }
    }
    int[][] result = new int[j + 1][2];
    for (int i = 0; i <= j; i++) {
        System.arraycopy(res[i], 0, result[i], 0, 2);

    }
    return result;
}
