 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if(n < 3) {
            return ans;
        }
        Arrays.sort(nums);
        for(int i = 0; i < n - 2; i++) {
            int target = -nums[i];
            int j = i + 1;
            int k = n - 1;
            while(j < k) {
                if(nums[j] + nums[k] == target) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(nums[i]); tmp.add(nums[j]); tmp.add(nums[k]);
                    ans.add(tmp);
                    while(j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while(j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++; k--;
                } else if(nums[j] + nums[k] < target) {
                    j++;
                } else {
                    k--;
                }
            }
            while(i + 1 < n && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return ans;
    }
}

