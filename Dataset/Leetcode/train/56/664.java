 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, (x,y)->x[0]-y[0]);
        int pos = 0;
        for (int i=1;i<intervals.length;++i){
            if (intervals[pos][1] >= intervals[i][0]){
                intervals[pos][1] = Math.max(intervals[pos][1],intervals[i][1]);
            }else{
                pos++;
                intervals[pos][0] = intervals[i][0];
                intervals[pos][1] = intervals[i][1];
            }
        }
        int[][] res = new int[pos+1][2];
        for (int i=0;i<=pos;++i){
            res[i] = intervals[i];
        }
        return res;
    }
}

