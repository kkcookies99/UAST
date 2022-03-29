 public int singleNumber(int[] nums) {
    if (nums.length==1) return nums[0];
    Arrays.sort(nums);
    if (nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];
    for (int i=1;i<nums.length;i+=2){
        if (nums[i]!=nums[i-1]) return (nums[i]==nums[i+1])?nums[i-1]:nums[i];
    }
    return 0;
}
