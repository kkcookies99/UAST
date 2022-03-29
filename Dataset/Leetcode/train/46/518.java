 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> resList = new ArrayList<>();
        int len = nums.length;
        if (len == 0) {
            return resList;
        }
        XXXRecursively(nums, 0, len, resList);
        return resList;
    }

    private void XXXRecursively(int[] nums, int start, int length, List<List<Integer>> resList) {
        int i;
        if (start == length) {
            List<Integer> res = new ArrayList<>();
            for (i = 0; i < length; i++) {
                res.add(nums[i]);
            }
            resList.add(res);
        } else {
            for (i = start; i < length; i++) {
                swap(nums, start, i);
                XXXRecursively(nums, start + 1, length, resList);
                swap(nums, start, i);
            }
        }
    }

    private void swap(int[] nums, int start, int i) {
        int temp;
        temp = nums[start];
        nums[start] = nums[i];
        nums[i] = temp;
    }
}

