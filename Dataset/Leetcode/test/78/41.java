class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length < 1){
            return res;
        }
        // 初始化[]
        res.add(new ArrayList<>());
        
        for(int i=0; i < nums.length; i++){
            int size = res.size();
            for(int j = 0; j < size; j++){
                List<Integer> list = res.get(j);
                List<Integer> tmpList = new ArrayList<>(list);
                tmpList.add(nums[i]);
                res.add(tmpList);
            }
        }
        return res;
    }
}

