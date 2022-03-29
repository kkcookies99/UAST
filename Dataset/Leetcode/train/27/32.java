 class Solution {
    public int XXX(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            count++;
            else
            nums[i]=Integer.MAX_VALUE;
        }
        Arrays.sort(nums);
        return count;
    }
}

