 class Solution {
    public int XXX(int[] nums, int val) {
          int j = nums.length - 1;
          for(int i = 0; i <= j; i++){
              if(nums[i] == val){
                  int temp = nums[j];
                  nums[j] = nums[i];
                  nums[i] = temp;

                  j--;
                  i--;
              }
          }

          return j+1;
    }
}

