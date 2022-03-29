 class Solution {
    public int[][] XXX(int[][] intervals) {
        if(intervals.length == 1)
            return intervals;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] x, int[] y) {
                if(x[0] == y[0])
                    return x[1] - y[1];
                return x[0] - y[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        int[] temp = intervals[0];
        for(int i = 1; i < intervals.length; i++) {
            //没有交集
            if(temp[1] < intervals[i][0] || temp[0] > intervals[i][1]) {
                list.add(temp);
                temp = intervals[i];
            } else {
                temp[0] = Math.min(temp[0], intervals[i][0]);
                temp[1] = Math.max(temp[1], intervals[i][1]);
            }
        }
        list.add(temp);
        int[][] ans = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}

