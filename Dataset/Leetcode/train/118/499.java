 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int row = 0;
        List<Integer> prelist = null;
        while (row < numRows) {
            List<Integer> curlist = new ArrayList<>();
            for (int i = 0; i <= row; i++) {
                if (i == 0 || i == row) {
                    curlist.add(1);
                } else {
                    curlist.add(prelist.get(i - 1) + prelist.get(i));
                }
            }
            res.add(curlist);
            prelist = curlist;
            row++;
        }
        return res;
    }
}

