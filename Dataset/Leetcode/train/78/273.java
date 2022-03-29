class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // 先加一个空集
        res.add(new ArrayList<>());

        for(int i=0; i<nums.length; i++){
            int count = res.size();
            for(int j=0; j<count; j++){
                List<Integer> temp = new ArrayList<>(res.get(j));
                // 空集.add(nums[i]) 即其本身
                temp.add(nums[i]);
                res.add(temp);
            }
        }

        return res;
    }
}

