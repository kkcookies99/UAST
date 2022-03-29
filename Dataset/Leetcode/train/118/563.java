 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows <= 0) return res;
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        res.add(row1);
        if (numRows == 1) return res;
        List<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(1);
        res.add(row2);
        if (numRows == 2) return res;
        for (int i = 3; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>(i);
            row.add(0, 1);
            for (int j = 1; j < i - 1; j++) {
                row.add(j, res.get(i-2).get(j-1) + res.get(i-2).get(j));
            }
            row.add(i - 1, 1);
            res.add(row);
        }
        return res;
    }
}

