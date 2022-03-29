class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>((int)(nums.length * 0.5));
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }
}

