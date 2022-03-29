 class Solution {
    public List<List<Integer>> XXX(int numRows) {
         List<List<Integer>> ans  = new ArrayList<List<Integer>>();
         if(numRows == 0)
           return ans;
         for(int i = 0; i < numRows; i++){
              List<Integer> temp = new ArrayList<>();
             for(int j = 0; j <= i; j++){
                 if(j == 0 || j == i){
                     temp.add(1);
                 }
                 else{
                     temp.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                 }
             }
             ans.add(temp);
         }
         return ans;
    }
}

