 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        if(numRows < 1){
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i < numRows; i++){
            List<Integer> item= new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    item.add(1);
                    continue;
                }
                // 获取上一个数据的所有数据
                List<Integer> preLast = result.get(i-1);
                item.add(preLast.get(j) + preLast.get(j-1));
            }
            result.add(item);
        }
        return result;
    }
}

