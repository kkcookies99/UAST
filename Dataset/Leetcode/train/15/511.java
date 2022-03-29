 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length < 3) {
            return ans;
        }
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        // 对数组中的每一个元素，分别对其后的所有元素进行XXX操作，组成XXX组合[x, XXX1, XXX2]
        // 排序数组中三数之和为0，则最小的数必须 <= 0
        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
            // 去除XXX组合中第一个元素x重复的情况
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            List<List<Integer>> combs = XXX(nums, i + 1, nums.length - 1, -nums[i]);
            for (List<Integer> comb : combs) {
                comb.add(nums[i]);
                ans.add(comb);
            }
        }
        return ans;
    }

    private List<List<Integer>> XXX(int[] nums, int start, int end, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                List<Integer> comb = new ArrayList<>();
                comb.add(nums[start]);
                comb.add(nums[end]);
                ans.add(comb);
                int left = start;
                int right = end;
                // 分别去除XXX1和XXX2重复的情况
                while (left < end && nums[left] == nums[start]) {
                    left++;
                }
                start = left;
                while (right > start && nums[right] == nums[end]) {
                    right--;
                }
                end = right;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return ans;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


