 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer>r=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(i==0||j==0||j==i) r.add(1);
                else{
                    int sum=res.get(i-1).get(j-1)+res.get(i-1).get(j);
                    r.add(sum);
                }
            }
            res.add(r);
        }
        return res;
    }
}

