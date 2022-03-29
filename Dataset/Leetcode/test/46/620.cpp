 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        int size = nums.size();
        helper(res, nums, 0, size);
        return res;
    }
private:
    void helper(vector<vector<int>>& res, vector<int>& nums, int start, int& size){
        if(start == size){
            res.emplace_back(nums);
        }
        else{
            for(int i = start; i < size; ++i){
                swap(nums[i], nums[start]);
                helper(res, nums, start + 1, size);
                swap(nums[i], nums[start]);
            }
        }
    }
};

