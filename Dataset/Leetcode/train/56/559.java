 class Solution {
    public int[][] XXX(int[][] intervals) {
       //定义排序规则
        Arrays.sort(intervals, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
        LinkedList<int[]> res = new LinkedList<>();
        int[] pre = intervals[0];
        for (int[] i : intervals) {
            if (i[0] > pre[1]) {
                res.add(pre);
                pre = i;
            } else {
                pre[1] = i[1] > pre[1] ? i[1] : pre[1];
            }
        }
        res.add(pre);
        return res.toArray(new int[res.size()][]);
    }
}

