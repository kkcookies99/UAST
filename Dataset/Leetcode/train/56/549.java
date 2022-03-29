 class Solution {
    public int[][] XXX(int[][] intervals) {
        if(intervals.length == 0) return new int[0][2];
        qsort(intervals,0,intervals.length-1);
        List<int[]> XXXd = new ArrayList<int[]>();
        for (int i = 0; i < intervals.length; ++i) {
            int L = intervals[i][0], R = intervals[i][1];
            if (XXXd.size() == 0 || XXXd.get(XXXd.size() - 1)[1] < L) {
                XXXd.add(new int[]{L, R});
            } else {
                XXXd.get(XXXd.size() - 1)[1] = Math.max(XXXd.get(XXXd.size() - 1)[1], R);
            }
        }
        return XXXd.toArray(new int[XXXd.size()][]);
    }

    public void qsort(int[][] intervals,int low,int high){
        int p,i,j;
        int[] temp = new int[2];
        if(low>=high) return;
        p = intervals[low][0];
        i = low;
        j = high;
        while(i<j){
            while(intervals[j][0]>=p&&i<j) j--;
            while(intervals[i][0]<=p&&i<j) i++;
            temp[0] = intervals[i][0];
            temp[1] = intervals[i][1];
            intervals[i][0] = intervals[j][0];
            intervals[i][1] = intervals[j][1];
            intervals[j][0] = temp[0];
            intervals[j][1] = temp[1];
        }
        temp[0] = intervals[low][0];
        temp[1] = intervals[low][1];
        intervals[low][0] = intervals[i][0];
        intervals[low][1] = intervals[i][1];
        intervals[i][0] = temp[0];
        intervals[i][1] = temp[1];
        qsort(intervals,low,j-1);
        qsort(intervals,j+1,high);
    }
}

