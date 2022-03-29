 class Solution {
    public int[][] XXX(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return intervals;
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(intervals[0][0], intervals[0][1]));
        Interval last;
        for (int i = 0; i < intervals.length; i++) {
            last = list.get(list.size() - 1);
            if (last.end < intervals[i][0]) {
                list.add(new Interval(intervals[i][0], intervals[i][1]));
            } else {
                last.end = Math.max(intervals[i][1], last.end);
            }
        }
        int size = list.size();
        int[][] ans = new int[size][2];
        for (int i = 0; i < size; i++){
            ans[i][0] = list.get(i).start;
            ans[i][1] = list.get(i).end;
        }
        return ans;
    }
}

