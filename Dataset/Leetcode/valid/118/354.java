 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows <= 0) return res;
        res.add(Arrays.asList(1));
        for(int i = 1; i < numRows; i++) {
            List<Integer> level = new ArrayList<>();
            for(int j = 0; j < i + 1; j ++) {
                if(j == 0 || j == i) {
                    level.add(1);
                } else {
                    level.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(level);
        }
        return res;
    }
}

