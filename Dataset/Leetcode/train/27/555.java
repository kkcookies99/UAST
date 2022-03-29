 class Solution {
    public int XXX(int[] nums, int val) {
        int i = 0;
        int j = nums.length-1;
        while(j>=i){
            while(j>=i&&nums[i]!=val) i++;
            while(j>=i&&nums[j]==val) j--;
            if(j>i){
                nums[i++] = nums[j--];
            }
        }
        return i;
    }
}

