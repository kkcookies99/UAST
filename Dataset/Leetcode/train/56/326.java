     public int[][] XXX(int[][] intervals) {
        Arrays.sort(intervals, (arr1, arr2) -> {
            if ((arr1[0] - arr2[0]) != 0)
                return arr1[0] - arr2[0];
            return arr2[1] - arr1[1];
        });
        int n = intervals.length;
        ArrayList<Integer> arrs = new ArrayList<>(n);
        boolean[] checked = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (checked[i])
                continue;
            int i_end = intervals[i][1];
            for (int j = i + 1; j < n; j++) {
                if (checked[j])
                    continue;
                int j_start = intervals[j][0], j_end = intervals[j][1];
                if (j_start <= i_end) {
                    i_end = Math.max(i_end, j_end);
                    checked[j] = true;
                } else {
                    break;
                }
            }
            intervals[i][1] = i_end;
            arrs.add(i);
        }
        int[][] ret = new int[arrs.size()][];
        for (int i = 0; i < arrs.size(); i++) {
            ret[i] = intervals[arrs.get(i)];
        }
        return ret;
    }

