 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int temp = 0;
        if(numRows==0) return list;
        for(int i = 0;i<numRows;i++){
             list.add(new ArrayList<Integer>());
             for(int j = 0;j<=i;j++){
                 if(j==0 || j == i ){
                   list.get(i).add(1);
                 }else{
                    temp = list.get(i-1).get(j-1)+list.get(i-1).get(j);
                    list.get(i).add(temp);
                 }
             }     
        }
        return list;
    }
}

