 class Solution {
    public int[][] XXX(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        int start = intervals[0][0],end = intervals[0][1];
        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][0]<=end)
                end = Math.max(intervals[i][1],end);
            else{
                res.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[res.size()][2]);
    }
}

