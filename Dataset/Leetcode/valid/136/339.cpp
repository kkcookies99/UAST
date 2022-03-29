 class Solution {
public:
    int singleNumber(vector<int>& nums) {
       sort(nums.begin(), nums.end());
       int i = 0;
       for(; i < nums.size() - 1; i+=2) {
           if(nums[i] != nums[i + 1]) {
               break;
           }
       }

       return i == nums.size() - 2 ? nums[nums.size() - 1] : nums[i];
    }
};

