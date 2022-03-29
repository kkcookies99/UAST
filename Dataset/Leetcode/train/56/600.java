 class Solution {
    public int[][] XXX(int[][] intervals) {
        int len = intervals.length;
        int[] l = new int[len];
        int[] r = new int[len];
        for (int i = 0; i < len; i++) {
            l[i] = intervals[i][0];
            r[i] = intervals[i][1];
        }
        Arrays.sort(l);
        Arrays.sort(r);

        List<int[]> list = new ArrayList<>();

        int indexL = 0;
        int indexR = 0;
        for (int i = 0; i < len; i++) {
            if (i + 1 < len && l[i + 1] <= r[i]) {
                indexR++;
            }else {
                int[] ints = new int[]{l[indexL], r[indexR]};
                list.add(ints);

                indexR++;
                indexL = indexR;
            }
        }

        int[][] result = new int[list.size()][2];
        list.toArray(result);

        return result;
    }
}

