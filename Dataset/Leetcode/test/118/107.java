 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> listList = new ArrayList<List<Integer>>();
        
        if(numRows == 0)
            return listList;
        
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        listList.add(list);
        List<Integer> lastList = new ArrayList<Integer>();
        for(int i = 1; i < numRows; i++){
            list = new ArrayList<Integer>();
            list.add(1);
            if(i > 1){
                lastList = listList.get(i - 1);
                for(int j = 1; j < i; j++){
                    list.add((lastList.get(j - 1) + lastList.get(j)));
                }
            }
            
            list.add(1);
            listList.add(list);
        }
        
        return listList;
    }
}

