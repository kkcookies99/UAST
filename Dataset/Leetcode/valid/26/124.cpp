 class Solution {
public:
    int XXX(vector<int>& nums) {
      int chg_pos = 1;
      if(nums.size() == 0)return 0;
      for(int i = 1;i < nums.size();i++){
        if(nums[i] != nums[i-1]){
          nums[chg_pos++] = nums[i];
        }
      }
      return chg_pos;
    }
};

