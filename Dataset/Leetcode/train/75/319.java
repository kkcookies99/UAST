class Solution {
    public void XXX(int[] nums) {
        doQuickSort(nums , 0 , nums.length-1);
    }    
    
    private void doQuickSort(int[] nums, int l, int r) {
        if (l < r) {
            int pointIndex = partition(nums, l, r);

            doQuickSort(nums, l, pointIndex - 1);
            doQuickSort(nums, pointIndex + 1, r);
        }
    }

    private int partition(int[] nums, int l, int r) {

        int left = l, right = r, povit = nums[l];
        while (left != right) {
            while (left < right && nums[right] > povit) right--;
            while (left < right && nums[left] <= povit) left++;
            if (left < right) swap(nums , left , right);
        }

        swap(nums, l, left);
        return left;
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}

