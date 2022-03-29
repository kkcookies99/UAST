 class Solution {
    public int XXX(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        do {
            int index = (end + start) / 2;
            int indexV = nums[index];
            if (indexV > target) {
                end = index-1;
                if(end<start){
                    return index;
                }
            } else if (indexV < target) {
                start = index+1;
                if(end<start){
                    return index + 1;
                }
            } else {
                return index;
            }
        } while (end >= start);
        return 0;
    }
}

