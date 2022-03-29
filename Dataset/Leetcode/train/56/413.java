 class Solution {
    public int[][] XXX(int[][] intervals) {
        int len = intervals.length;
        //按照 左 边界排序
        Arrays.sort(intervals, (arr1, arr2) -> arr1[0] - arr2[0]);
        int[][] res = new int[len][2];

        //i指向新区间的第一个小区间，k为合并后的新区间个数
        int i = 0, k = 0;
        while (i < len) {
                int left = intervals[i][0];
                //合并区间的过程就是修改right的过程
                int right = intervals[i][1];

                //寻找可以合并的区间并完成合并
                int j = i + 1;
                while (j < len && right >= intervals[j][0]) {
                    right = Math.max(right, intervals[j][1]);
                    j++;
                }

                //存储新区间的范围
                res[k][0] = left;
                res[k][1] = right;
                k++;

                i = j; 
        }

        return Arrays.copyOf(res, k);
    }
}

