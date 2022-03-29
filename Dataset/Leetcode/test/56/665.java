 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->(a[0] - b[0]));
        int length = intervals.length;
        List<int[]> ret = new ArrayList<>();
        if (length == 0) {
            return ret.toArray(new int[ret.size()][]);
        }
        int left = intervals[0][0];
        int right = intervals[0][1];
        for (int i = 1; i < length; i++) {
            int curLeft = intervals[i][0];
            int curRight = intervals[i][1];
            if (curLeft > right) {
                ret.add(new int[]{left, right});
                left = curLeft;
            }
            if (curRight > right) {
                right = curRight;
            }
        } 

        ret.add(new int[]{left, right});

        return ret.toArray(new int[ret.size()][]);
    } 
}

