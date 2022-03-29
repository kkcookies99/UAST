 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        ArrayList<List<Integer>> rows = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            row.add(0, 1);
            if (i > 2) {
                for (int j = 1; j <= i - 2; j++) {
                    row.add(j, rows.get(i - 2).get(j - 1) + rows.get(i - 2).get(j));
                }
            }
            if (i >= 2) {
                row.add(i - 1, 1);
            }
            rows.add(row);
        }
        return rows;
    }
}
