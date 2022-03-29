 class Solution {
    public int singleNumber(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(!set.add(nums[i])) set.remove(nums[i]);
        // }
        // return (int)set.toArray()[0];
        int a = 0;
        for(int i = 0; i < nums.length;i++) a ^= nums[i];
        return a;
    }
}

