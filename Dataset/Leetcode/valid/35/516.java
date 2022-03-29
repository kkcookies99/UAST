 class Solution {
    public int XXX(int[] nums, int target) {
        int ret = Arrays.binarySearch(nums, target);
        return ret >= 0 ? ret : -1 - ret;
    }
}

