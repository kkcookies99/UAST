 class Solution {
    public int XXX(int[] nums, int target) {
        int index = Arrays.binarySearch(nums,target);
        return index<0?-index-1:index;
    }
}

