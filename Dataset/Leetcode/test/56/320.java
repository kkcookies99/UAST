 class Solution {
    public int[][] XXX(int[][] intervals) {
        //按左边界排序
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            int j=i+1;
            for (; j < intervals.length; j++) {
                if(intervals[j][0] <= right){
                    if(intervals[j][1] > right) {
                        right = intervals[j][1];
                    }
                }else{
                    break;
                }
            }
            i=j-1;
            result.add(new int[]{left, right});
        }
        return result.toArray(new int[result.size()][2]);
    }
}

