 class Solution {
    public int XXX(int[] nums, int val) {
        if (nums.length==0){
            return 0;
        }
        int len=nums.length;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==val){
                nums[i]=51;
                len--;
            }
        }
        Arrays.sort(nums);
        return len;
    }
}

