 class Solution {
    public int XXX(int[] nums, int target) {
        int point = Arrays.binarySearch(nums,target);
        return point < 0 ? ((point * -1) - 1 ):point;
    }
}

