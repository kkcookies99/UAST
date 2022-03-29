 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows==0) return res;
        List<Integer> li = new ArrayList<>();
        li.add(1);
        res.add(li);
        if (numRows==1) return res;
        li = new ArrayList<>();
        li.add(1);
        li.add(1);
        res.add(li);
        if (numRows==2) return res;
        li = new ArrayList<>();
        for (int i = 2; i<numRows;i++){
            for (int j = 0; j<=i;j++){
                if (j==0) li.add(1);
                else if (j==i) li.add(1);
                else if (j>0&&j<i){
                    int tmp = res.get(i-1).get(j-1)+res.get(i-1).get(j);
                    li.add(tmp);
                }
            }
            res.add(li);
            li= new ArrayList();
            li=new ArrayList<>();
        }
        return res;
    }
}

