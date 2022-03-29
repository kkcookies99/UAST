 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0) return res;
        res.add(new ArrayList<Integer>());
        res.get(0).add(1);
        for(int i = 1; i < numRows; i++){
            List<Integer> tmp = new ArrayList<>();
            for(int j = 0; j < i + 1; j++){
                tmp.add(getOrDefault(res.get(i - 1), j - 1, 0) + getOrDefault(res.get(i - 1), j, 0));
            }
            res.add(tmp);
        }
        return res;
    }
    public Integer getOrDefault(List<Integer> list, int i, int defaultVal){
        if(i < list.size() && i >= 0) return list.get(i);
        else return defaultVal;
    }
}

