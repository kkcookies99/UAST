     public int XXX(int[] nums, int target) {
        return searchMid(nums, 0, nums.length, target);
    }

    public int searchMid(int[] nums, int start, int end, int target) {
        if (start == end) return start;
        int p = (start+end)/2;

        if (nums[p] == target) return p;
        if (nums[p] > target) return searchMid(nums, start, p, target);
        if (nums[p] < target) return searchMid(nums, p+1, end, target);
        return p;
    }

