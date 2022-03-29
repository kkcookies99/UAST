 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(v -> v[0]));
        
        int[][] res = new int[intervals.length][2];
        int idx = -1;
        for (int[] i : intervals) {
            // if (idx == -1 最先进入第一个数组 或者 当前区间end < 遍历区间start 说明不需要XXX) 反之
            if (idx == -1 || i[0] > res[idx][1]) {
                res[++idx] = i; 
            } else {
                res[idx][1] = Math.max(res[idx][1], i[1]);
            }
        }
        return Arrays.copyOf(res, idx + 1);

    }
}

