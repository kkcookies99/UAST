 class Solution {
public:
    int XXX(vector<int>& nums) {
      int n = nums.size(),i = 0,j = 1;
      if(n == 0) return n;
      while(j < n){
          if(nums[i] == nums[j]) j++;
          else nums[++i] = nums[j++];
      }
      return i+1;
  }
};

