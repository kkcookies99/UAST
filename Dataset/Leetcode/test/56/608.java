 class Solution {
    public int[][] XXX(int[][] intervals) {
        if (intervals == null || intervals.length == 0){
            return new int[0][0];
        }
        if (intervals.length == 1){
            return intervals;
        }
        Arrays.sort(intervals, (a,b) -> {
            if(a[0] - b[0]!= 0){
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });
        ArrayList<int[]> list = new ArrayList<>();
        int begin = intervals[0][0];
        int end = intervals[0][1];
        for(int i= 1; i< intervals.length; i++){
            if(intervals[i] == intervals[i -1]){
                break;
            }
            if( intervals[i][0] <= end ){
                end = Math.max(end,intervals[i][1]);
            } else {
                list.add(new int[]{begin,end});
                begin = intervals[i][0];
                end = intervals[i][1];
            }
        }
        list.add(new int[]{begin,end});
        return  list.toArray(new int[list.size()][]);
    }
}

