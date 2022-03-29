 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return res;
        }
        bt(res, nums, 0);
        return res;
    }

    public void bt(List<List<Integer>> res, int[] nums, int i){
        if(i == nums.length){
            List<Integer> cur = new ArrayList<>(){{
                for(int num : nums){
                    add(num);
                }
            }};
            res.add(cur);
            return;
        }
        for(int j = i; j < nums.length; j++){
            swap(nums, i, j);
            bt(res, nums, i+1);
            swap(nums, i, j);
        }
    }

    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

