 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i = 1; i <= numRows; i++) {
            res.add(XXXList(i));
        }
        return res;
    }
    
    private List<Integer> XXXList(int numRows) {
        List<Integer> list = new ArrayList<Integer>();
        if(numRows == 1) list.add(1);
        if(numRows == 2) {list.add(1);list.add(1);}
        if(numRows > 2) {
            list.add(1);
            List<Integer> preList = XXXList(numRows - 1);
            for(int i = 0; i < preList.size() - 1; i++) {
                list.add(preList.get(i) + preList.get(i + 1));
            }
            list.add(1);
        }
        return list;
    } 
}

