class Solution {
public:
  void XXX(vector<int>& nums) {
    for (int i = 0, l = 0, r = nums.size()-1; i <= r; )
      if (nums[i] == 2) swap(nums[i], nums[r--]);
      else if (nums[i] == 0) swap(nums[i++], nums[l++]);
      else i++;
  }
};

