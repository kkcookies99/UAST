 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        if(numRows==0)return list;
        list.add(new ArrayList<Integer>(){{this.add(1);}});
        for(int i=1;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(list.get(i-1).get(j)+list.get(i-1).get(j-1));
            }
            row.add(1);
            list.add(row);
        }
        return list;
    }
}

