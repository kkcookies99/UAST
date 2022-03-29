 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            List<Integer> ret = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i)
                    ret.add(1);
                else{
                    ret.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(ret);
        }
        return ans;
    }
}

