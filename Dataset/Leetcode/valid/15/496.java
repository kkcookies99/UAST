 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);//数组中可能包含重复的元素
        
        for(int i = 0; i < nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int target = -nums[i];//和为0
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right) {
                int sum = nums[left] + nums[right];
                if(sum == target) {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;//在想等的时候排序重复的可能性，如果不等就不必考虑重复元素的情况了
                } else if(sum > target) right--;
                else left++;
            }
        }
        return ans;
    }
}

