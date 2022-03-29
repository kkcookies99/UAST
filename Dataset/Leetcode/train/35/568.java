 class Solution {
    public int XXX(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while(i <= j) {
            System.out.println(i + " " + j);
            int mid = (i + j) / 2;
            if(nums[mid] > target) j = mid - 1;
            else if(nums[mid] < target) i = mid + 1;
            else return mid;
        }
        
        // 未找到相等的
        int index = i >= 0 && i <= nums.length - 1 ? i : j;
        return nums[index] > target ? index : index + 1;
    }
}```

