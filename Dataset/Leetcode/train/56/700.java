 class Solution {
    public int[][] XXX(int[][] intervals) {
        sort(intervals);
/*        for (int[] interval : intervals) {
            Arrays.stream(interval).forEach(System.out::println);
        }*/

        int n = intervals.length;
        if (n == 0) {
            return new int[][]{};
        }
        int min = intervals[0][0];
        int max = intervals[0][1];
        List<int[]> res = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            // 分情况讨论
            // 1.包含
            if (intervals[i][0] >= min && intervals[i][1] <= max) {
                continue;
            }
            // 2. 相交，因为已经将数组按照第一列的值从小到大排序了
            // 所以不会出现左相交，只会出现右相交
            if (intervals[i][0] <= max && intervals[i][1] >= max) {
                max = intervals[i][1];
            }

            // 3. 不相交
            if (intervals[i][0] > max) {
                res.add(new int[]{min, max});
                min = intervals[i][0];
                max = intervals[i][1];
            }
        }
        // 将最后的区间添加到结果中
        res.add(new int[]{min, max});
        // 将list结果转为二维数组
        int size = res.size();
        int[][] ans = new int[size][2];
        int k = 0;
        for (int i = 0; i < size; i++) {
            ans[i][0] = res.get(k)[0];
            ans[i][1] = res.get(k)[1];
            k++;
        }
        return ans;
    }

    // 对二维数组按照第一列的值，从小到大排序
    public void sort(int[][] matrix) {
        Arrays.sort(matrix, new Comparator<int[]>() {
            @Override
            public int compare(int[] x, int[] y) {
                if (x[0] > y[0]) {
                    return 1;
                } else if (x[0] < y[0]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
}

