 class Solution {
    public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });

        List<int[]> list = new ArrayList<>();
        int[] interval = intervals[0];
        list.add(interval);
        for (int i = 1;i < intervals.length;i++) {
            if (intervals[i][0] <= interval[1]) {
                interval[1] = Math.max(interval[1], intervals[i][1]);
            } else {
                interval = intervals[i];
                list.add(interval);
            }
        }

        int[][] answer = new int[list.size()][2];
        for (int i = 0;i < answer.length;i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

