 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int low = 0, high = 1;
        while(high < intervals.length){
            if(intervals[high][0] > intervals[low][1]){
                ++ low;
                intervals[low][0] = intervals[high][0];
                intervals[low][1] = intervals[high][1];
            }else{
                intervals[low][1] = Math.max(intervals[high][1], intervals[low][1]);
            }
            ++ high;
        }
        int[][] ans = new int[low + 1][2];
        for(int i = 0; i < ans.length; ++i){
            ans[i][0] = intervals[i][0];
            ans[i][1] = intervals[i][1];
        }
        return ans;
    }
}

