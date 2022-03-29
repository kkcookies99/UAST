 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals,(o1,o2)->(o1[0]-o2[0]));
        int start = intervals[0][0],end = intervals[0][1];

        List<int[]> lst = new ArrayList<>();
        for(int i = 1;i<intervals.length;i++){
            int start2 = intervals[i][0],end2 = intervals[i][1];
            if(end2<=end){
                //说明包含在内，不用操作

            }else if(start2<=end && end2>=end){
                //说明接壤
                //start不变
                end = end2;
            }else if(start2>end){
                //说明分开了
                lst.add(new int[]{start,end});
                start = start2;
                end = end2;
            }
        }
        lst.add(new int[]{start,end});
        
        return lst.toArray(new int[lst.size()][]);
    }
}

