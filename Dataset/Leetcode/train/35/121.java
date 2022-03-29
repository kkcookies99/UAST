 class Solution {
    public int XXX(int[] nums, int target) {
        int res = Arrays.binarySearch(nums, target);
        if(res < 0)
            return Math.abs(res) - 1;
        return res;
    }
}

