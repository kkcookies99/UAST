 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals,Comparator.comparingInt(x->x[0]));
        List<int[]> res=new ArrayList<>();
        for(int i=0,j=1;j<=intervals.length;j++){
            if(j==intervals.length || intervals[j][0]>intervals[i][1]){
                res.add(new int[]{intervals[i][0],intervals[i][1]});
                i=j;
            }else{
                intervals[i][1]=Math.max(intervals[j][1],intervals[i][1]);
            }
        }
        return res.toArray(new int[][]{});
    }
}

