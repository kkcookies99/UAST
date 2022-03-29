 class Solution {
    public int[][] XXX(int[][] intervals) {
        // 根据区间的开始，将区间排序
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] nums1, int[] nums2){
                return nums1[0] - nums2[0];
            }
        });

        List<int[]> res = new ArrayList<>();

        // 区间的开始和结束
        int start = intervals[0][0];
        int end = intervals[0][1];

        // 合并上一个区间
        for(int i=1; i<intervals.length; i++){
            if(end < intervals[i][0]){
                // 上一个 end < 当前 start
                // [1,2] [3,4]
                // 上一个区间结束 
                res.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }else if(end < intervals[i][1]){
                // 上一个区间 end >= 当前 start，但是小于当前 end
                // [1,4] [2,5]
                // 合并
                end = intervals[i][1];
            }
            // 去考虑下一个区间
        }

        res.add(new int[]{start, end});

        return res.toArray(new int[res.size()][2]);
    }
}

