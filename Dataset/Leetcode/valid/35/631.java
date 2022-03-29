 class Solution {
    public int XXX(int[] nums, int target) {
        int l = 0, r = nums.length - 1, m, res = -1;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (target < nums[m]) {
                if (m == 0 || target > nums[m - 1]) {
                    res = m;
                    break;
                }
                r = m - 1;
            } else if (target > nums[m]) {
                if (m == nums.length - 1 || target < nums[m + 1]) {
                    res = m + 1;
                    break;
                }
                l = m + 1;
            } else {
                res = m;
                break;
            }
        }
        return res;
    }
}

