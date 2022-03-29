 class Solution {
    public int[][] XXX(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) return intervals;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> ans = new ArrayList<>();
        int n = intervals.length;
        for (int i = 1; i < n; i++) {
            if (intervals[i - 1][1] < intervals[i][0])
                ans.add(intervals[i - 1]);
            else {
                intervals[i][0] = intervals[i - 1][0];
                intervals[i][1] = Math.max(intervals[i][1], intervals[i - 1][1]);
            }
        }
        ans.add(intervals[n - 1]);
        return ans.toArray(new int[ans.size()][]);
    }
}

