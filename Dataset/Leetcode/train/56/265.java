 class Solution {
    public int[][] XXX(int[][] intervals) {
        int n=intervals.length;
        if (n == 1) {return intervals;}
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });
        int l=intervals[0][0], r=intervals[0][1];
        List<int[]> res = new ArrayList<>();
        res.add(new int[]{l, r});
        for (int i=0; i<n; i++) {
            if (intervals[i][0] <= r) {
                l = Math.min(l, intervals[i][0]);
                r = Math.max(r, intervals[i][1]);
                res.remove(res.size()-1);
                res.add(new int[]{l, r});
            } else {
                l = intervals[i][0];
                r = intervals[i][1];
                res.add(intervals[i]);
            }System.out.println("l="+l+"  r="+r);
        }
        return res.toArray(new int[0][]);
    }
}

