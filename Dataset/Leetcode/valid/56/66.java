    public int[][] XXX(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        List<int[]> list = new ArrayList<>();
        int le = intervals[0][0], ri = intervals[0][1];
        
        for (int[] interval: intervals) {
            if (interval[0] > ri) {
                list.add(new int[]{le, ri});
                le = interval[0];
                ri = interval[1];
            } else {
                le = Math.min(le, interval[0]);
                ri = Math.max(ri, interval[1]);
            }
        }
        list.add(new int[]{le, ri});
        int size = list.size();
        int[][] XXX = new int[size][2];
        for (int i = 0; i < size; i ++) XXX[i] = list.get(i);
        return XXX;
    }

