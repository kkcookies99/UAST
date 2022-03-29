 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0){
            return res;
        }
        List<Integer> inRes = new ArrayList<>();
        inRes.add(1);
        res.add(inRes);
        for(int i = 1; i < numRows; i++){
            List<Integer> prev = res.get(i - 1);
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for(int j = 1; j < prev.size(); j++){
                curr.add(prev.get(j - 1) + prev.get(j));
            }
            curr.add(1);
            res.add(curr);
        }
        return res;
    }
}

