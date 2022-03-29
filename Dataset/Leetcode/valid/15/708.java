 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i]>0) break;
            if(i>0&&nums[i]==nums[i-1]) continue;
            int target = 0 - nums[i];
            int left = i + 1;
            int right = n - 1;
            while(left<right){
                if(target == nums[left]+nums[right]){
                    result.add(Arrays.asList(new Integer[]{-target,nums[left],nums[right]}));
                    left++;
                    while(left<right&&nums[left]==nums[left-1]){
                        left++;
                    }
                    right--;
                    while(left<right&&nums[right]==nums[right+1]){
                        right--;
                    }
                }else if(target > nums[left]+nums[right]){
                    left++;
                }else if(target < nums[left]+nums[right]){
                    right--;
                }
            }
        }
        return result;
    }
}

