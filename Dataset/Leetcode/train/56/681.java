 class Solution {
    public int[][] XXX(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return intervals;
        }
        Arrays.sort(intervals, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });
        List<int[]> res = new ArrayList<>();
        int i = 0;
        int[] temp = new int[]{intervals[0][0], intervals[0][1]};
        while (i < intervals.length) {
            if (intervals[i][0] <= temp[1]) {
                temp[1] = Math.max(intervals[i][1], temp[1]);
                i++;
            } else {
                res.add(new int[]{temp[0], temp[1]});
                temp[0] = intervals[i][0];
                temp[1] = intervals[i][1];
            }
        }
        res.add(new int[]{temp[0], temp[1]});
        int[][] arr = new int[res.size()][];
        for (int j = 0; j < res.size(); j++) {
            arr[j] = res.get(j);
        }
        return arr;
    }
}

