 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res =  new ArrayList<>();
        if(numRows <= 0){
            return res;
        }
        List<Integer> t = new ArrayList<Integer>();
        t.add(1);
        res.add(t);
        if(numRows == 1){
            return res;
        }
        List<Integer> pre;
        for(int i = 1; i < numRows; ++i){
            t = new ArrayList<Integer>();
            pre = res.get(i - 1);
            t.add(1);
            for(int j = 1; j < i; ++j){
                t.add(pre.get(j - 1) + pre.get(j));
            }
            t.add(1);
            res.add(t);
        }
        return res;
    }
}

