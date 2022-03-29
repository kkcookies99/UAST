class Solution {
    public int[][] XXX(int[][] intervals) {
        if(intervals.length==0) return intervals;
        // 按左边界排序
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int res[][] = new int[intervals.length][2];
        int i=0;
        // res[i]表示当前最右侧区间，由于已经根据左边界排过序，只需要判断与最右侧区间有无相交
        res[0] = intervals[0];
        for (int[] ints : intervals) {
            // 有相交，当前左边界小于之前的右边界，更新右边界
            if(ints[0]<=res[i][1]) res[i][1] = Math.max(res[i][1] , ints[1]);
            else {
                // 无相交
                i++;
                res[i]=ints;
            }
        }
        // 把res后面的0（由于区间合并产生的0）去掉
        return Arrays.copyOf(res,i+1);
    }
}


