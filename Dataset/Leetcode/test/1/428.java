 class Solution {
    // 该题目可以用双指针来做，不过对于java写起来稍微复杂，后续补充，先用hash的方式来做
    public int[] XXX(int[] nums, int target) {
        // 首先异常判断
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        if(nums == null || nums.length < 2) return result;
        for(int i = 0; i < nums.length; i++) {
            // 先做判断，不能先放入hash值，比如[3,4] target=6，此时会出错
            if(map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
