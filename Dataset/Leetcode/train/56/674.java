 class Solution {
    public int[][] XXX(int[][] intervals) {

        if (intervals.length <= 1) {
            return intervals;
        }
	// 二维数组排序lambda写法
        Arrays.sort(intervals, Comparator.comparing(a -> a[0]));

        List<int[]> res = new ArrayList<>();
        for (int[] interval : intervals) {
            if (res.isEmpty() || interval[0] >  res.get(res.size() - 1)[1]) {
                res.add(new int[]{interval[0], interval[1]});
            }
            else if (interval[0] <= res.get(res.size() - 1)[1]) {
                res.get(res.size() - 1)[1] = Math.max(interval[1], res.get(res.size() - 1)[1]);
            }
        }

        int[][] ans = new int[res.size()][2];
        int i = 0;
        for (int[] a : res) {
            ans[i ++] = a;
        }
        return ans;
    }
}

