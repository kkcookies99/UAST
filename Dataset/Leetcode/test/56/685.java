 class Solution {
    public int[][] XXX(int[][] intervals) {
        List<int []> list = new ArrayList<>();
        
        Arrays.sort(intervals,new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                return a[0]-b[0];
            }
        });
        if(intervals==null || intervals.length<=1)
            return intervals;
        for(int i=0;i<intervals.length-1;i++){
            if(intervals[i][1]<intervals[i+1][0]){
                list.add(intervals[i]);
                continue;
            }
            if(intervals[i][1]>=intervals[i+1][0]){
                if(intervals[i][0]<intervals[i+1][0])
                    intervals[i+1][0]=intervals[i][0];
                if(intervals[i][0]<=intervals[i+1][1] && intervals[i][1]>intervals[i+1][1])
                    intervals[i+1][1]=intervals[i][1];
            }
        }
        
        list.add(intervals[intervals.length-1]);
        
        int[][] res = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}

