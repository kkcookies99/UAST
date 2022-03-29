class Solution {
    public int[][] XXX(int[][] intervals) {
        if(intervals == null || intervals.length < 2) {
            return intervals;
        }
        
        int n = intervals.length;
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        
        // 遍历所有区间，如果当前的起点在上一个末尾之前，则合并
        //              如果在上一个区间末尾之后，则把上一个区间放到答案中去
        List<int[]> ans = new ArrayList<>();
        int[] pre = intervals[0];
        for(int i = 1; i < n; i++) {
            if(intervals[i][0] <= pre[1]) {
                pre[1] = Math.max(pre[1], intervals[i][1]);
            } else {
                ans.add(pre);
                pre = intervals[i];
            }
        }
        
        // 把最后一个放进去
        ans.add(pre);
        
        return ans.toArray(new int[ans.size()][2]);
    }
}

