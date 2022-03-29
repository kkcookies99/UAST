 class Solution {
    public List<List<Integer>> XXX(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 1; i <= numRows;i ++){
            List<Integer> list = new ArrayList<>();
            for(int j = 1;j <= i;j++){
                //只要不是第一个和最后一个 那么就取上一行的前后两个之和
                if(j != 1 && j != i){
                    int tmp =result.get(i-2).get(j-2) + result.get(i-2).get(j-1);
                    list.add(tmp);
                }else{
                    list.add(1);
                }
            }
            result.add(list);
        }
        return result;
    }
    
}

