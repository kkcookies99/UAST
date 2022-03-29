 class Solution {
public:
  int singleNumber(vector<int>& nums) {
    int ans = 0;
    for (int x : nums)
      ans ^= x;
    return ans;
  }
};

