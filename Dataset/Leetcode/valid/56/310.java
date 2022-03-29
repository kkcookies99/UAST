 class Solution {
    public int[][] XXX(int[][] intervals) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (var p : intervals) {
            map.put(p[0], map.getOrDefault(p[0], 0) + 1);
            map.put(p[1], map.getOrDefault(p[1], 0) - 1);
        }

        List<int[]> res = new LinkedList<>();
        int sum = 0, left = 0;
        for (var entry : map.entrySet()) {
            if (sum == 0) {
                left = entry.getKey();
            }
            sum += entry.getValue();
            if (sum == 0) {
                res.add(new int[]{ left, entry.getKey() });
            }
        }

        return res.toArray(new int[0][0]);
    }
}

