 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        if(numRows == 0) return null;

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        tmp.add(1);
        res.add(tmp);

        if(numRows == 1) return res;

        int row = 2;
        while(row <= numRows) {
            List<Integer> preRow = res.get(row - 2);
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            for(int i = 0; i < preRow.size() - 1; i++) {
                curRow.add(preRow.get(i) + preRow.get(i + 1));
            }
            curRow.add(1);

            res.add(curRow);
            row++;
        }

        return res;
    }
}

