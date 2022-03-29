 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, (int[] a, int[] b) -> {
            return a[0] - b[0];
        });

        List<int[]> list = new ArrayList<>();

        list.add(new int[]{intervals[0][0], intervals[0][1]});

        for(int i = 1; i < intervals.length; i++) {
            int preEnd = list.get(list.size() - 1)[1];
            int curStart = intervals[i][0];
            int curEnd = intervals[i][1];

            if(curStart <= preEnd) {    // 合并
                int preStart =  list.get(list.size() - 1)[0];
                list.remove(list.size() - 1);
                list.add(new int[]{preStart, Math.max(preEnd, curEnd)});

            } else {                    // 不合并 
                list.add(new int[]{curStart, curEnd});
            }
        }

        return list.toArray(new int[list.size()][2]);
    }
}

