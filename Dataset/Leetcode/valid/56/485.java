 class Solution {
    public int[][] XXX(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][0];
        }
        List<int[]> resList = new ArrayList<>();

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        for (int[] tempArray : intervals
        ) {
            if (tempArray[0] < left) {
                left = tempArray[0];
                right = tempArray[1];
            } else if (tempArray[0] > right) {
                resList.add(new int[]{left, right});
                left = tempArray[0];
                right = tempArray[1];
            } else {
                if (tempArray[1] > right) {
                    right = tempArray[1];
                }
            }
        }
        resList.add(new int[]{left, right});
        int[][] res = resList.toArray(new int[resList.size()][2]);
        return res;
    }
}


