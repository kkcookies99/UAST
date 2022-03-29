 class Solution {
    public void XXX(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return; 
        int cur0 = -1, cur2 = nums.length;
        for(int i = 0; i < cur2; i++) {
            switch(nums[i]) {
                case 0:
                    if(i == cur0 + 1)       cur0++;
                    else if(i > cur0 + 1)   swap(nums, i, ++cur0);
                case 1:
                    break;
                case 2:
                    swap(nums, i--, --cur2);
            }
        }
    }
    
    private void swap(int[] nums, int l, int r) {
        if(nums[l] == nums[r]) return;
        nums[l] = nums[l] ^ nums[r];
        nums[r] = nums[l] ^ nums[r];
        nums[l] = nums[l] ^ nums[r];
    }
}

