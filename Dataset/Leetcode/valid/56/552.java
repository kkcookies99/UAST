 class Solution {
    public int[][] XXX(int[][] intervals) {
        if (intervals.length==1){
            return intervals;
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        boolean tmp = false;
        int a = 0;

        for (int[] interval : intervals) {
            if (map.containsKey(interval[0])){
                map.put(interval[0], Math.max(interval[1],map.get(interval[0])));
            }else {
                map.put(interval[0], interval[1]);
            }

        }
        int k = 0;
        for (Integer integer : map.keySet()) {
            intervals[k][0] = integer;
            intervals[k][1] = map.get(integer);
            k++;
        }
        map.clear();

        int max=-1;
        for (int i = 0; i < intervals.length; i++) {
            if (!tmp) {
                a = intervals[i][0];
                max=intervals[i][1];
                tmp = true;
            }
            if (i + 1 < intervals.length && max >= intervals[i + 1][0] /*&&intervals[i][1] <= intervals[i + 1][1]*/) {
                max=Math.max(max,intervals[i + 1][1]);
            } else {
                tmp = false;
                map.put(a, max);
                max=-1;
            }
        }

        int[][] ints = new int[map.size()][2];
        k = 0;
        for (Integer integer : map.keySet()) {
            ints[k][0] = integer;
            ints[k][1] = map.get(integer);
            k++;
        }
        return ints;
    }
}

