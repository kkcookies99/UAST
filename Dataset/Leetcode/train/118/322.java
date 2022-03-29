 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        if(numRows == 1){
            List<Integer> res = new ArrayList<>();
            res.add(1);
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(res);
            return ans;
        }
        List<List<Integer>> ans = XXX(numRows - 1);
        List<Integer> newres = new ArrayList();
        List<Integer> res = ans.get(ans.size() - 1);
        newres.add(1);
        for(int i = 0;i < res.size() - 1;i++){
            newres.add(res.get(i) + res.get(i + 1));
        }
        newres.add(1);
        ans.add(newres);
        return ans;
    }
}

