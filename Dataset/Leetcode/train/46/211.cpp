class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<vector<int> > ans;
        do{
            ans.push_back(nums);
        }while(nextPermutation(nums));
        return ans;
    }

    bool nextPermutation(vector<int>& nums) {
        int size = nums.size();
        int left = size - 2;
        int right = size - 1;
        while(left >= 0 && nums[left] >= nums[left + 1]) left--;
        if (left >= 0) {
            while(right >= 0 && nums[left] >= nums[right]) right--;
            swap(nums[left], nums[right]);
        } else {
            return false;
        }
        reverse(nums.begin() + left + 1, nums.end());
        return true;
    }
};

