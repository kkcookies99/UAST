 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new LinkedList<>();
        List<Integer> lastList = new LinkedList<>();
        List<Integer> currList = new LinkedList<>();
        lastList.add(1);
        currList.add(1);
        currList.add(1);
        if(numRows == 0){
            return res;
        }
        res.add(lastList);
        if(numRows == 1){
 
            return res;
        }
        res.add(currList);
        if(numRows == 2){
            return res;
        }
        for(int i=2;i<numRows;++i){
            List<Integer> tmpList = currList;
            currList = new LinkedList<>();
            for(int j=0;j<tmpList.size()+1;++j){
                if(j==0 || j==tmpList.size()){
                    currList.add(1);
                }else{
                    currList.add(tmpList.get(j-1)+tmpList.get(j));
                }
            }
            lastList = tmpList;
            res.add(currList);
        }
        return res;
    }
}

