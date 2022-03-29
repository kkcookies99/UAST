 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0){
            return res;
        }
        List<Integer> pre = new ArrayList<>();
        pre.add(1);
        res.add(pre);
        for(int i = 1;i < numRows;++i){
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for(int j = 1;j < pre.size();++j){
                cur.add(pre.get(j-1)+pre.get(j));
            }
            cur.add(1);
            res.add(cur);
            pre = cur;
        }
        return res;
    }
}

