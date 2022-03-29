 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>(){ // 对区间的第一个数字升序排序
            public int compare(int[] o1, int[] o2){
                return o1[0] - o2[0];
            }
        });
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        if(intervals.length > 1){
            for(int i=1; i<intervals.length; i++){
                int[] interval = intervals[i];
                int[] lastInterval = list.get(list.size() - 1);
                // 如果当前区间的起始值，比上一个区间的末尾值小，说明这两个区间有重叠，进行合并                
                if(interval[0] <= lastInterval[1]){ 
                    lastInterval[1] = Math.max(interval[1], lastInterval[1]);
                }else{
                    list.add(interval);   // 与上一个区间无重叠，那么直接加到list中。
                }
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}

