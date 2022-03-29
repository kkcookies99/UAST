 class Solution {
    public int[][] XXX(int[][] intervals) {
        if(intervals.length <=1 ){
            return intervals;
        }
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0],i2[0]));
        //记录合并后区间的索引值，从0开始。num+1 表示独立区间的数量
        int num = 0;
        List<int[]> list = new ArrayList<>();
        //当前数组
        int start = intervals[0][0];
        int end  = intervals[0][1];
        for(int i =0;i < intervals.length; i++){
            int[] next = intervals[i];
           //下一个数组的起始点小于等于当前数组终止点，即有交集可合并，取两个范围的最小和最大值
            if(next[0] <= end){
                end =  Math.max(next[1],end);
                start = Math.min(next[0],start);
            }else{
               //没有交集,继续循环
               start = next[0];
               end = next[1];
               num ++;    
            }
            //判断是否覆盖当前范围
            if(list.size() != 0 &&  list.size() >= num+1){
                list.remove(num); 
            }
            list.add(num,new int[] {start,end});   
        }
        return list.toArray(new int[list.size()][2]);
    }
}

