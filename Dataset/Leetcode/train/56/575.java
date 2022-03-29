 class Solution {
    public int[][] XXX(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(m -> m[0]));
        int[] pre = intervals[0];
        list.add(pre);
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= pre[1]) {
                pre[0] = Math.min(pre[0], intervals[i][0]);
                pre[1] = Math.max(pre[1], intervals[i][1]);
            }
            else {
                list.add(intervals[i]);
                pre = intervals[i];
            }
        }

        return  list.toArray(new int[list.size()][2]);
    }
}

