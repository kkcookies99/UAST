 class Solution {
    public int[][] XXX(int[][] intervals) {
        if (intervals.length == 1) return intervals;

        List<int []> res = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        res.add(intervals[0]);
        
        for (int i = 1; i < intervals.length ;i++) {
            int size = res.size() - 1;
            if (intervals[i][0]  <= res.get(size)[1]) {
                res.get(size)[1] = Math.max(res.get(size)[1], intervals[i][1]);
            } else {
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}

