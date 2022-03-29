 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> returnList = new ArrayList<>();
        List<Integer> oneList = new ArrayList<>();
        oneList.add(1);
        returnList.add(oneList);
        if(1 == numRows){
            return returnList;
        }
        addRow(returnList,returnList.get(0), 2, numRows);
        return returnList;
    }

    public void addRow(List<List<Integer>> returnList,List<Integer> lastRow,int rowNum,int numRows){
        if(rowNum == numRows+1){
            return;
        }
        List<Integer> newList = new ArrayList<>();
        for(int i=0;i<=lastRow.size();i++){
            if(i == 0 || i== lastRow.size()){
                newList.add(1);
            }else{
                newList.add(lastRow.get(i)+lastRow.get(i-1));
            }
        }
        returnList.add(newList);
        addRow(returnList,newList, rowNum+1, numRows);
    }
}

