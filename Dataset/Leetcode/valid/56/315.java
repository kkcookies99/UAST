 class Solution {
    public int[][] XXX(int[][] intervals) {
        int n = 10005;
        Integer[] map = new Integer[n];

        for (var p : intervals) {
            map[p[0]] = map[p[0]] == null ? 1 : map[p[0]] + 1;
            map[p[1]] = map[p[1]] == null ? -1 : map[p[1]] - 1;
        }

        List<int[]> res = new LinkedList<>();
        int sum = 0, left = 0;
        for (int i = 0; i < n; i++) {
            if (map[i] != null) {
                if (sum == 0) {
                    left = i;
                }
                sum += map[i];
                if (sum == 0) {
                    res.add(new int[]{ left, i });
                }
            }
        }

        return res.toArray(new int[0][0]);
    }
}

