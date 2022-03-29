     public int[][] XXX(int[][] intervals) {
        if (intervals.length == 1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> res = new ArrayList<>();
        int[] nums = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (nums[1] < intervals[i][0]) {
                // 直接添加
                res.add(nums);
                nums = intervals[i];
            } else {
                nums[1] = Math.max(intervals[i][1], nums[1]);
            }
            if (i == intervals.length - 1) {
                res.add(nums);
            }
        }
        return res.toArray(new int[][]{});
    }

