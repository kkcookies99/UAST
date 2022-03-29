class Solution {
    public void XXX(int[] nums) {
        QuickSort(nums, 0, nums.length - 1);
    }
    public void QuickSort(int[] nums, int low, int high) {
        if(low >= high) return;
        int mm = nums[low];
        int l = low;
        int h = high;
        while(h > l) {
            while(h > l && nums[h] >= mm) h--;
            nums[l] = nums[h];
            while(h > l && nums[l] <= mm) l++;
            nums[h] = nums[l];
        }
        nums[l] = mm;
        QuickSort(nums, low, l - 1);
        QuickSort(nums, l + 1, high);
    }
}

