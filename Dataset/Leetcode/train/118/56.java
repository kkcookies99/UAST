 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        if(numRows==0){
            return res;
        }
        if(numRows==1){
            List<Integer> r=new  ArrayList<>();
            r.add(numRows);
            res.add(r);
            return res;
        }
        res.add(Arrays.asList(1));
        for(int i=2;i<=numRows;i++){
            List<Integer> path=new ArrayList<>();
            path.add(1);
            for(int j=1;j<res.get(res.size()-1).size();j++){
                path.add(res.get(res.size()-1).get(j-1)+res.get(res.size()-1).get(j));
            }
            path.add(1);
            res.add(path);
        }
        return res;
    }
}

