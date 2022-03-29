 class Solution {
    public int[][] XXX(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        if(intervals.length<=1) return intervals;
        Arrays.sort(intervals,(x,y)->x[0]-y[0]);//按第一个元素排序
        int[] last = intervals[0];//记录上一个数组
        for(int i=1;i<intervals.length;i++){
            if(last[1]>=intervals[i][0]){
                int[] m = new int[]{last[0],Math.max(last[1],intervals[i][1])};
                last = m;
            }else{
                list.add(last);
                last = intervals[i];
            }
        }
        list.add(last);//不要忘了把最后一个加入
        return list.toArray(new int[list.size()][]);
    }
}

