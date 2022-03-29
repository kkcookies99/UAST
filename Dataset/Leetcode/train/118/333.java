 class Solution {
    public List<List<Integer>> XXX(int numRows) {
       List<List<Integer>> result = new ArrayList<>();
       for(int i=0; i<numRows; ++i){
           List<Integer> itemList = new ArrayList<>();
           for(int j=0; j<i+1; j++){
              if(j == 0||j==i){
                  itemList.add(1);
              }else{
                  itemList.add(result.get(i-1).get(j)+result.get(i-1).get(j-1));
              }
            }
            result.add(itemList);
        }
        return result;
    }
}

