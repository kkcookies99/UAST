 class Solution {
    public int XXX(int[] nums, int val) {
            if(nums == null) return 0;
            int showIndex = nums.length-1;
            for(int i = nums.length-1;i>-1;i--){
                if(nums[i]==val){
                    nums[i] = nums[showIndex];
                    showIndex--;
                }
            }
            return showIndex+1;
    }
}

