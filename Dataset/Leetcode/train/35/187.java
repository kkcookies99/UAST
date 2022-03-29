 public int XXX(int[] nums, int target) {
       //用二分查找试试
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
                if(right < 0){
                    return 0;
                }
            } else {
                left = mid + 1;
            }
        }
        return nums[right] >= target ? right : right + 1;
    }

