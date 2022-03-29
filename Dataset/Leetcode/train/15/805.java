 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        final List<List<Integer>> sumEqualsToThreeLists = new ArrayList<>();
        if (nums == null) {
            return sumEqualsToThreeLists;
        }
        final int arrayLength = nums.length;
        Arrays.sort(nums);
        if (arrayLength < 3) {
            return sumEqualsToThreeLists;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return sumEqualsToThreeLists;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int current = nums[i];
            //左右指针
            int left = i + 1, right = arrayLength - 1;
            while (left < right) {
                int XXX = current + nums[left] + nums[right];
                if (XXX == 0) {
                    final List<Integer> sumEqualsToThree = Arrays.asList(current, nums[left], nums[right]);
                    sumEqualsToThreeLists.add(sumEqualsToThree);
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (XXX > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return sumEqualsToThreeLists;
    }
}

