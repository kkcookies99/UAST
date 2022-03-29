 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> rs=new ArrayList<>();
        // first is 1,last is 1
        // in the middle,we merge rs[row-1][col]+rs[row-1][col-1]
        rs.add(Arrays.asList(1));
        if(numRows==1){
            return rs;
        }
        for(int i=2;i<=numRows;i++){
            ArrayList<Integer> list=new ArrayList<>();
            list.add(1);
            for(int j=1;j<i-1;j++){
                list.add(rs.get(i-1-1).get(j)+rs.get(i-1-1).get(j-1));
            }
            list.add(1);
            rs.add(list);
        }
        return rs;
    }
}```

