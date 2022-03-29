 class Solution {
    public int[][] XXX(int[][] intervals) {
        if(intervals.length == 1) {
            return intervals;
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] x, int[] y) {
                if(x[0] == y[0]) {
                    return x[1] - y[1];
                }
                return x[0] - y[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        int lo = intervals[0][0], hi = intervals[0][1];
        for(int i = 1; i < intervals.length; i++) {
            int[] array = intervals[i];
            // 没有交集，不能合并
            if(array[0] > hi || array[1] < lo) {
                list.add(new int[]{lo, hi});
                lo = array[0];
                hi = array[1];
            } else {
            // 有交集，可以合并
                lo = Math.min(lo, array[0]);
                hi = Math.max(hi, array[1]);
            }
        }
        list.add(new int[]{lo, hi});
        int[][] ans = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}

