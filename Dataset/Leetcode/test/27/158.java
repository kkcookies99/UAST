 class Solution {
    public int XXX(int[] nums, int val) {
        int n = nums.length;
        int cnt = 0;
        int j = 0;
        for(int i = 0; i < n; i++)
        {
            if(nums[i] != val)
            {
                nums[j++] = nums[i];
            }
            else
                cnt++;
        }
        return n-cnt;
    }
}

