 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->{return a[0]-b[0];});
        LinkedList<int[]> ints = new LinkedList<>();
        int tailBound=intervals[0][0], frontBound=intervals[0][1];
        for (int[] interval : intervals) {
            if (interval[0] > frontBound) {
                ints.add(new int[]{tailBound, frontBound});
                tailBound = interval[0];
                frontBound = interval[1];
            } else {
                if (interval[1] > frontBound) frontBound = interval[1];
            }
        }
        ints.add(new int[]{tailBound, frontBound});
        int len = ints.size();
        int[][] res = new int[len][];
        for (int i = 0; i < len; i++) {
            res[i] = ints.get(i);
        }
        return res;
    }
}

