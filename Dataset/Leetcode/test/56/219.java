 class Solution {
    public int[][] XXX(int[][] intervals) {
        if (intervals.length == 1) return intervals;
        Arrays.sort(intervals, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
            return Integer.compare(a[0], b[0]);
    }
        });
        List<int[]> res = new ArrayList<>();
        int min = intervals[0][0];
        int max = intervals[0][1];
        int i = 1;
        while (i < intervals.length) {
            if (intervals[i][0] <= max) max = Math.max(max, intervals[i][1]);
            else {
                int[] ele = new int[]{min, max};
                res.add(ele);
                min = intervals[i][0];
                max = intervals[i][1];
            }
            i++;
        }
        int[] last = new int[]{min, max};
        res.add(last);
        int[][] ans = new int[res.size()][2];
        for (int j = 0; j < res.size(); j++) ans[j] = res.get(j);
        return ans;
    }
}

