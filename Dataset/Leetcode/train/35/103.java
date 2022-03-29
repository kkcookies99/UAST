 public int XXX(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        return binarySearch(left, right, nums, target);

    }

    public int binarySearch(int left, int right, int[] nums, int target){
        if(left>right) return left;
        int mid = (left+right)/2;

        if(nums[mid]==target) return mid;
        else if(nums[mid]<target) return binarySearch(mid+1, right, nums, target);
        else return binarySearch(left, mid-1, nums, target);
    }

