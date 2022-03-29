 class Solution {
    public int XXX(int[] nums, int val) {
        if (nums.length == 0) {
              return 0;
          }
          int i = 0,n = nums.length, j = n-1;

          while (i <= j) {
              if (nums[i] == val && nums[j] != val) {
                  nums[i] = nums[i] ^ nums[j];
                  nums[j] = nums[i] ^ nums[j];
                  nums[i] = nums[i] ^ nums[j];
                  i++;
              }
              if (nums[i] != val){
                  i++;
              }
              if (nums[j] == val){
                  j--;
              }
          }
          return i;
    }
}

