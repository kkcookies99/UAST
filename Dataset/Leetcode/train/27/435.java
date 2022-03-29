 class Solution {
    public int XXX(int[] nums, int val) {
    int len = nums.length;
    int num=0xffffff;
    for (int i = 0; i < len; i++) {
      if(val==nums[i]){
        len--;
        for(int j=i;j<nums.length-1;j++){
          nums[j]=nums[j+1];
        }
        i--;
      }
    }
    return len;
    }
}

