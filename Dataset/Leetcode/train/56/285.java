 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals,(r,l)->r[0]-l[0]);
        int slow=0;
        for (int fast=0;fast<intervals.length;fast++){      
            if (intervals[slow][1]<intervals[fast][0]) intervals[++slow]=intervals[fast];
            else intervals[slow][1]=Math.max(intervals[slow][1],intervals[fast][1]);
        }
        return Arrays.copyOf(intervals,slow+1);
    }
}

