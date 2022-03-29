 class Solution {
    public int XXX(int[] nums, int target) {
        int n = nums.length;
        int index  = n/2;
        int left = -1, right = n;
        while(left!=right-1) {
            index = (left + right)/2;
            if(target==nums[index])
                return index;
            if(target>nums[index]) {
                left = index;
            }else {
                right = index;
            }
        }
        if(target>nums[index]) {
            return ++index;
        }else {
        System.out.println(index);
            return index;
        }
    }
}

