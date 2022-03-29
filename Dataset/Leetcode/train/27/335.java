 class Solution {
    public int XXX(int[] nums, int val) {
        int i=0;
        int n = nums.length-1;
        while (i<=n){
            if(nums[i]==val){
                nums[i]=nums[n--];
                i--;
            }
            i++;
        }
        return n+1;

    }
}

