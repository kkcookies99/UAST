 class Solution {
    public int[][] XXX(int[][] intervals) {
        if (intervals.length == 1) {
            return intervals;
        }
        // 升序排序
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        int[][] temp = new int[intervals.length][2];
        int tempIndex = 0;
        int left = intervals[0][0];
        int right = intervals[0][1];
        int index = 1;
        while (index < intervals.length) {
            if (right < intervals[index][0]) {
                temp[tempIndex][0] = left;
                temp[tempIndex][1] = right;
                tempIndex++;
                left = intervals[index][0];
                right = intervals[index][1];
            } else if (right < intervals[index][1]) {
                right = intervals[index][1];
            }
            index++;
        }
        temp[tempIndex][0] = left;
        temp[tempIndex][1] = right;
        return Arrays.copyOf(temp, tempIndex+1);
    }
}

