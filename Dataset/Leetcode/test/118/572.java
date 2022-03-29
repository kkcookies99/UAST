 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows >= 1) {
            res.add(Arrays.asList(new Integer[]{1}));
        }
        if (numRows >= 2) {
            res.add(Arrays.asList(new Integer[]{1, 1}));
        }
        if (numRows >= 3) {
            for (int i = 3; i <= numRows; i++) {
                List<Integer> temp = new ArrayList<>();
                temp.add(1);
                List<Integer> lastRowRes = res.get(i - 2);
                for(int j = 0; j < i - 2; j++) {
                    temp.add(lastRowRes.get(j)+lastRowRes.get(j+1));
                }
                temp.add(1);
                res.add(temp);
            }
        }
        return res;
    }
}

