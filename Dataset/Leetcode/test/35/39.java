 public int XXX(int[] nums, int target) {
        int l = -1;
        int r = nums.length;
        while(l + 1 != r){
            int mid = l + ((r - l) >> 1);
            if (nums[mid]==target){
                return mid;
            }else if(nums[mid] < target){
                l = mid;
            }else if(nums[mid] > target){
                r = mid;
            }
        }
        return r;
    }

