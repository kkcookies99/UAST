 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        std::vector<std::vector<int>> ret;
        std::vector<int> temp;
        helper(ret, nums, temp, 0);
        return std::move(ret);
    }
    
    void helper(std::vector<std::vector<int>>& res, std::vector<int>& nums, std::vector<int>& temp, int i){
        if(i >= nums.size()){
            res.push_back(temp);
            return;
        }
        
        temp.push_back(nums[i]);
        helper(res, nums, temp, i+1);
        temp.pop_back();
        helper(res, nums, temp, i+1);
    }
};```
