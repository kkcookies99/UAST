 class Solution {
    public int[][] XXX(int[][] intervals) {
        int length = intervals.length;
        if(length == 1) return intervals;
        Arrays.sort(intervals,(o1,o2)->(o1[0]-o2[0]));
        List<int[]> res = new ArrayList<>();
        int index = 0;
        res.add(intervals[0]);
        for(int i = 1;i<length;i++){
            int left = intervals[i][0],right = intervals[i][1];
            int[] curr = res.get(index);//传递的还是地址  
            if(curr[1] >= left){
                curr[1] = Math.max(curr[1],right);
            }
            else{
                res.add(intervals[i]);index++;
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}

