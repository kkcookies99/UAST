 class Solution {
    public void XXX(int[] nums) {
        int m = 0;
        int n = nums.length - 1;
        int offset = 0;
        while(m<n) {   
            if(nums[m] > nums[n]) {
                int temp = nums[m];
                nums[m] = nums[n];
                nums[n] = temp;
            }
            if(nums[m] == 0) {
                if(offset > 0) {
                    int temp = nums[m];
                    nums[m] = nums[m-offset];
                    nums[m-offset] = temp;
                    offset--;
                } else {
                    m++;
                }
                
            }
            if(nums[n] == 2) {
                n--;
            }
            if(nums[m] == 1 && nums[n] == 1) {
                offset++;
                m++;
            }
        }
    }
}

