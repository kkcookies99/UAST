 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0){
            return res;
        }
        for(int k = 0; k < numRows; k++){
            res.add(new ArrayList<>());
        }
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < i + 1; j++){
                if(j == 0 || j == i){
                    res.get(i).add(1);
                    continue;
                }
                int tool1 = res.get(i - 1).get(j - 1);
                int tool2 = res.get(i - 1).get(j);
                res.get(i).add(tool1 + tool2);
            }
            
        }
        return res;

    }
}

