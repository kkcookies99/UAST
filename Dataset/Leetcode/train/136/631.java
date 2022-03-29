 class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) if (!set.add(num)) set.remove(num);
        return set.iterator().next();
    }
}

