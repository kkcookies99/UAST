 class Solution {

    public List<List<Integer>> XXX(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if (len < 3) return ans;
        for (int i = 0; i < len - 2; i++) {
            if (nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            XXX(nums, -nums[i], i + 1, len - 1, ans);
        }
        return ans;
    }

    void XXX(int[] nums, int target, int start, int end, List<List<Integer>> ans) {
        while (start < end) {
            if (nums[start] + nums[end] == target) {
                List<Integer> res = new ArrayList<>();
                res.add(-target);
                res.add(nums[start]);
                res.add(nums[end]);
                ans.add(res);
                while(start < end && nums[start+1] == nums[start]) ++start;
                while(start < end && nums[end-1] == nums[end]) --end;
                ++start;
                --end;
            } else if (nums[start] + nums[end] < target) {
                ++start;
            } else {
                --end;
            }
        }
    }
}

