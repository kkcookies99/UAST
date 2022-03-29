 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
   Arrays.sort(nums);
            int n = nums.length-1;
            int l, r;
            ArrayList<List<Integer>> lists = new ArrayList<>();
            for (int i = 0; i <= n - 2; i++) {
                  if (nums[i]>0)break;
                    if (i>0&&nums[i]==nums[i-1])continue;
                l = i + 1;
                r = n;
                while (l < r) {
                  
                    if (nums[i] + nums[r] + nums[l] > 0) {
                        r--;
                    } else if (nums[i] + nums[r] + nums[l] < 0) {
                        l++;
                    } else {
                        lists.add(new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r])));
                        l++;
                        r--;
                        while (l<r&&nums[l]==nums[l-1])l++;
                        while (l<r&&nums[r]==nums[r+1])r--;
                    }
                }
            }
            return lists;
    }
}

