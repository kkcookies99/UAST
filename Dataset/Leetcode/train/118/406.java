 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        if(numRows==0)return ans;
        List<Integer> list=new ArrayList<>();
        list.add(1);
        ans.add(list);
        for(int i=1;i<numRows;++i){
            List<Integer> l=new ArrayList<>();
            l.add(1);
            for(int j=1;j<i;++j){
                l.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
            l.add(1);
            ans.add(l);
        }
        return ans;
    }
}

