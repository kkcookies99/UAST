 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> data = new LinkedList<>();
        if (nums == null || nums.length < 3) {
            return data;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int sum = -nums[i];
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[j] + nums[k] > sum) {
                    k--;
                } else if (nums[j] + nums[k] < sum) {
                    j++;
                } else {
                    List<Integer> list = new LinkedList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    data.add(list);
                    k -= 1;
                    while (k > j && nums[k] == nums[k+1]) {
                        k--;
                    }
                }
            }         
        }
        return data;
    }
}