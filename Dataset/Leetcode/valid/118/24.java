 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < numRows; i++){
            List<Integer> temp = new ArrayList<>();
            if(i == 0){
                temp.add(1);
            }else{
                List<Integer> list = ans.get(i - 1);
                int size = list.size() + 1;
                for(int j = 0; j < size; j++){
                    if(j == 0 || j == size - 1){
                        temp.add(1);
                    }else{
                        temp.add(list.get(j - 1) + list.get(j));
                    }
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}

