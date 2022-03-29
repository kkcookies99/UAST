 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int[]>(){
            public int compare(int[] interval1,int[] interval2){
                return interval1[0] - interval2[0];
            }
        });
        int start = intervals[0][0],end = intervals[0][1];

        List<int[]> ans = new ArrayList<int[]>();
        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][0]<=end ){
                if(intervals[i][1] > end){
                    end = intervals[i][1];
                }
            }else{
                ans.add(new int[]{start,end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[ans.size()][]);

    }
}



