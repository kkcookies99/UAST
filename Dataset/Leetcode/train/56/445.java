 class Solution {
    public int[][] XXX(int[][] intervals) {
        List<int[]> arr=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int t=0;
        for(int i=0;i<intervals.length-1;i++){
            if(intervals[i][1]>=intervals[i+1][0]){
                // ------
                //     -----
                if(intervals[i+1][1]>=intervals[i][1]){
                    intervals[i+1][0]=intervals[i][0];
                }else{
                    // ---------
                    //     ---
                    intervals[i+1][0]=intervals[i][0];
                    intervals[i+1][1]=intervals[i][1];
                }
            }else{
                // ------
                //        -----
                arr.add(intervals[i]);
                t++;
            }
        }
        arr.add(intervals[intervals.length-1]);
        return arr.toArray(new int[t][]);
    }
}

