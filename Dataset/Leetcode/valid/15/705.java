 class Solution {

    public List<List<Integer>> XXX(int[] nums) {
        //List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; ++i) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(new ArrayList<>(temp));
                    ++left;
                    --right;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    ++left;
                } else {
                    --right;
                }
            }
        }
        return new ArrayList<>(result);
    }

}

