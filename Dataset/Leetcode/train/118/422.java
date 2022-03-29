 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> lastlist = new ArrayList<>();
        if(numRows==0) return result;
        if(numRows==1){
            list.add(1);
            result.add(list);
            return result;
        }
        for(int i=0;i<numRows;i++){
            for(int j=0;j<=i;j++){
                if(i==0){
                    list.add(1);
                    continue;
                }
                if(j%i==0){
                    list.add(1);
                }
                else{
                    list.add(lastlist.get(j)+lastlist.get(j-1)); 
                }
            }
            result.add(list);
            lastlist = list;
            list = new ArrayList<>();
        }
        return result;
    }
}

