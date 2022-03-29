 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list = new ArrayList();
        for(int i = 0;i < numRows; ++i){
            List<Integer> rows = new ArrayList();
            for (int j = 0;j <= i; ++j){
                if(j == 0 || j == i){
                    rows.add(1);
                }else{
                    rows.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            }
            list.add(rows);
        } 
        return list;
    }
}

