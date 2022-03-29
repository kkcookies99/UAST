 public int XXX(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo < hi){
            int mid = lo + (hi - lo) /2;
            int num = nums[mid];
            if (num == target){
                return mid;
            } else if (num > target){
                hi = mid - 1;
            }else {
                lo = mid + 1;
            }
        }
        //如果是lo <= hi 最后的结果是lo会比现在多一位，那么就直接返回lo就好了
        if(nums[lo] == target){
            return lo;
        }
        return nums[lo] > target ? lo : lo + 1;
    }

