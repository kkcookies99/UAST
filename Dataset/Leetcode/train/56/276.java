 class Solution {
    public int[][] XXX(int[][] intervals) {
        
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        int count = intervals.length;
        for(int i = 1; i < intervals.length; i++) {
            if (intervals[i - 1][1] >= intervals[i][0]) {
                intervals[i][0] = intervals[i - 1][0];
                if (intervals[i - 1][1] > intervals[i][1]) {
                    intervals[i][1] = intervals[i - 1][1];
                }
                intervals[i - 1] = null;
                count--;
            }
        }

        int[][] result = new int[count][2];
        int index = 0;
        for(int i = 0; i < intervals.length; i++) {
            if (intervals[i] != null) {
                result[index][0] = intervals[i][0];
                result[index++][1] = intervals[i][1];
            }
        }
        return result;
    }
}

