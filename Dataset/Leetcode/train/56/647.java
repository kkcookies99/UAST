 class Solution {
    public int[][] XXX(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0])
                    return o1[1] - o2[1];
                return o1[0] - o2[0];
            }
        });
        int[][] res = new int[intervals.length][2];
        int index = 0;
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] >= intervals[i + 1][0] && intervals[i][0]<=intervals[i+1][1]) {
                intervals[i + 1] = new int[]{Math.min(intervals[i][0],intervals[i+1][0]),
                        Math.max(intervals[i][1],intervals[i + 1][1])};
                continue;
            }
            res[index] = intervals[i];
            index++;
        }
        res[index] = intervals[intervals.length - 1];
        int[][] result = new int[index + 1][2];
        while (index >= 0) {
            result[index] = res[index];
            index--;
        }
        return result;
    }
}

