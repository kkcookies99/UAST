 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++){
            List<Integer> tmp = new ArrayList<Integer>();
            if(i==0){
                tmp.add(1);
            }
            else if(i==1){
                tmp.add(1);
                tmp.add(1);
            }
            else{
                tmp.add(1);
                for(int j=1;j<i+1;j++){
                    if(j==i)
                        tmp.add(1);
                    else{
                        List<Integer> lastRow = resList.get(i - 1);
                        tmp.add(lastRow.get(j - 1) + lastRow.get(j));
                    }
                    
                }
            }
            resList.add(tmp);
        }

        return resList;
    }
}

