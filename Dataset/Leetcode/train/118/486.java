 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i  = 0; i < numRows; i++) {
            List<Integer> t = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == i || j == 0) {
                    t.add(1);
                } else {
                    t.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));
                }
            }
            res.add(t);
        }
        return res;
    }
}

