 class Solution {
    public int[][] XXX(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        // 按照开始时间对集合重排序
        Arrays.sort(intervals, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
        });

        // 开始时间、结束时间赋初值
        int start = intervals[0][0], end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++){
            // 如果当前区间开始时间小于等于上一个时间段的结束时间，则可以合并
            if (intervals[i][0] <= end){
                // 合并后新结束时间为之前结束时间和当前新时间段结束之间的最大值
                end = Math.max(end, intervals[i][1]);
            }else{
                // 无法合并则添加上一个时间段记录
                res.add(new int[]{start, end});
                // 给开始、结束时间赋信值
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        // 别忘了最后一个时间段要加上
        res.add(new int[]{start, end});

        // List转Array
        return res.toArray(new int[res.size()][2]);
    }
}

