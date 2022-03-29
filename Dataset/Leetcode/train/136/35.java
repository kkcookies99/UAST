 class Solution {
    public int singleNumber(int[] nums) {
    HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!result.add(nums[i])){
                result.remove(nums[i]);
            }
        }
        return result.iterator().next();
    }
}

