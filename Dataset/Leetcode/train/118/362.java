 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList();
        List<Integer> temp = new ArrayList();
        for(int i=1;i<=numRows;i++){
            if(i == 1){
                temp.add(1);
                res.add(new ArrayList<>(temp));
                temp.clear();
                continue;
            }
            for(int j=1;j<=i;j++){
                if(j==1||j==i){
                    temp.add(1);
                }else{
                    temp.add(res.get(i-2).get(j-2)+res.get(i-2).get(j-1));
                }
            }
            res.add(new ArrayList<>(temp));
            temp.clear();
        }
        return res;
    }
}

