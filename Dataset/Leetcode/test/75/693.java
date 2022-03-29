 class Solution {
    public void XXX(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        
        int low = -1;
        int cur = 0;
        int high = nums.length;
        
        while (cur < high) {
            if (nums[cur] == 0) {
                swap(nums, ++low, cur++);
            } else if (nums[cur] == 2) {
                swap(nums, cur, --high);
            } else {    //nums[cur] == 1
                cur++;
            }
        }
    }
    
    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

