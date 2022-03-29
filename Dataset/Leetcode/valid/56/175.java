 class Solution {
    public int[][] XXX(int[][] intervals) {
        if (intervals.length == 1) {
            return intervals;
        }
        int[] axis1 = new int[10001];
        int[] axis2 = new int[10001];
        List<int[]> result = new LinkedList<>();
        for (int[] interval : intervals) {
            axis1[interval[0]] += 1;
            axis2[interval[1]] -= 1;
        }
        int start = -1;
        int end = -1;
        int i = 0;
        int count = 0;
        while (i <= 10000) {
            if (axis1[i] > 0 && start == -1) {
                start = i;
            }
            count += axis1[i];
            count += axis2[i];
            if (start != -1 && count == 0) {
                int[] newInterval = {start, i};
                start = -1;
                result.add(newInterval);
            }
            i++;
        }
        int[][] a = new int[result.size()][];
        return result.toArray(a);
    }
}

