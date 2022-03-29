      public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        return XXXHelper(intervals);
    }

    public int[][] XXXHelper(int[][] intervals) {
       List<int[]> lists = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (i != intervals.length - 1 && intervals[i + 1][0] <= intervals[i][1]) {
                lists.add(new int[]{intervals[i][0], Math.max(intervals[i][1], intervals[i + 1][1])});
                i++;
            } else {
                lists.add(new int[]{intervals[i][0], intervals[i][1]});
            }
        }
        int[][] newNums = lists.toArray(new int[lists.size()][]);

        if (lists.size() == intervals.length) return newNums;
        else return XXX(newNums);
    }

