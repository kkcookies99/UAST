 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows <= 0){
            return res;
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        res.add(list);
        if(numRows == 1){
            return res;
        }
        for(int i = 1; i<numRows;i++){
            list = new ArrayList<>();
            list.add(1);
            List<Integer> t = res.get(i-1);
            for(int j=1;j<i;j++){
                list.add(t.get(j)+t.get(j-1));
            }
            list.add(1);
            res.add(list);
        }

        return res;
    }
}

