 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals,new Comparator<int []>(){
            public int compare(int []a,int []b){
                return a[0]-b[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        int res[] = new int[2];
        int max = intervals[0][1];
        res[0] = intervals[0][0];
        int index = 0;
        for(int i=1;i<intervals.length;i++){
            if(max<intervals[i][0]){
                res[1] = max;
                list.add(new int[]{res[0],res[1]});
                res[0] = intervals[i][0];
                max = intervals[i][1];
            }else{
                if(max<intervals[i][1]){
                    max = intervals[i][1];
                }
            }
        }
        res[1] = max;
        list.add(new int[]{res[0],res[1]});
        return list.toArray(new int[list.size()][2]);
    }
}