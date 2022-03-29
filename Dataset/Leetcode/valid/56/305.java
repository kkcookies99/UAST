 class Solution {
    public int[][] XXX(int[][] intervals) {
        LinkedList<int[]> res = new LinkedList<>();
        Arrays.sort(intervals, (a, b) -> a[0] != b[0] ? 
                    Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
        res.add(intervals[0]);

        for (var p : intervals) {
            var last = res.getLast();
            if (last[1] >= p[0]) {
                last[1] = p[1] > last[1] ? p[1] : last[1];
            } else {
                res.add(p);
            }
        }

        return res.toArray(new int[0][0]);
    }
}

