 class Solution {
    public int XXX(int[] nums, int val) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int valNum = 0;
        if (n == 0) {
            return 0;
        }
        while (left <= right) {
            if (nums[left] == val) {
                while (left < right && nums[right] == val) {
                    right--;
                    valNum++;
                }
                if (left == right) {
                    valNum++;
                    break;
                } else {
                    nums[left] = nums[right];
                    valNum++;
                    right--;
                }
            }
            left++;
        }
        return n - valNum;
    }
}

