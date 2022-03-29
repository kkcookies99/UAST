 class Solution {
    public int[][] XXX(int[][] intervals) {
        int[] arr = new int[intervals.length];
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });
        List list = new ArrayList();
        for (int i = 0;i < intervals.length;i++){
            while (i+1<intervals.length&&intervals[i][1]>=intervals[i+1][0]){
                intervals[i+1][0] = intervals[i][0];
                if(intervals[i][1]<intervals[i+1][1]){
                    intervals[i+1][1] = intervals[i+1][1];
                }else {
                    intervals[i+1][1] = intervals[i][1];
                }
                i++;
            }
            list.add(intervals[i]);
        }
        int[][] res = new int[list.size()][2];
        list.toArray(res);
        return res;
    }
}

