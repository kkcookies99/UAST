 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>(){{add(1);}});
        if ( numRows == 1 ) {
            return res;
        }
        List<Integer> row = new ArrayList<>();
        row.add(1);
        row.add(1);
        res.add(row);
        if ( numRows == 2 ) {
            return res;
        } else {
            List<Integer> pre_row = res.get(1);
            for ( int i = 3; i <= numRows; i++ ) {
                List<Integer> rowi = new ArrayList<>();
                rowi.add(1);
                for ( int j = 1; j < i -1; j++ ) {
                    rowi.add(pre_row.get(j)+pre_row.get(j-1));
                }
                rowi.add(1);
                
                pre_row = rowi;
                res.add(rowi);
            }
            return res;
        }
    }
}

