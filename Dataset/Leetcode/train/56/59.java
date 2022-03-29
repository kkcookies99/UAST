class Solution {
    public int[][] XXX(int[][] intervals) {
        if(intervals.length == 0 || intervals.length == 1) return intervals;
        int[][] res = new int[intervals.length][2];
        Arrays.sort(intervals, (a,b)->(a[0]-b[0]));
        int start = intervals[0][0], endmax = intervals[0][1], count = 0;
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0]>endmax){
                res[count][0] = start;
                res[count][1] = endmax;
                endmax = intervals[i][1];
                start = intervals[i][0];
                count++;
            }else {
                endmax = Math.max(endmax, intervals[i][1]);
            }
            if(i == intervals.length-1){
                res[count][0] = start;
                res[count][1] = endmax;
            }
        }
        return Arrays.copyOf(res, count+1);
    }
}

