 class Solution {
    public int[][] XXX(int[][] intervals) {
        // sort array by first dimension
        Arrays.sort(intervals, (o1, o2)->o1[0]-o2[0]);
        ArrayList<int[]> ans = new ArrayList<>();
        int n = intervals.length;
        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] <= intervals[i-1][1]) {
                intervals[i][0] = intervals[i-1][0];
                intervals[i][1] = Math.max(intervals[i][1], intervals[i-1][1]);
            } else {
                ans.add(new int[]{intervals[i-1][0], intervals[i-1][1]});
            }
        }
        ans.add(new int[]{intervals[n-1][0], intervals[n-1][1]});
        int[][] ret = new int[ans.size()][2];
        for(int i = 0; i < ans.size(); i++) {
            ret[i][0] = ans.get(i)[0];
            ret[i][1] = ans.get(i)[1];
        }
        return ret;
    }
}

