 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==i||j==0){
                    list.add(1);
                }else {
                    list.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));
                }
            }
            res.add(list);
        }
        return res;
    }
}

