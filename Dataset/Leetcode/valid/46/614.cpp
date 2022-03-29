 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        ios_base::sync_with_stdio(false);
        vector<vector<int>> result;
        vector<int> ans;
        XXXCore(result,nums,ans);
        return result;
    }

    void XXXCore(vector<vector<int>>& result, vector<int>& nums, vector<int>& ans){
        if(ans.size() == nums.size()){
            result.push_back(ans);
            return ;
        }

        for(int i = 0; i < nums.size(); ++i){
            if(nums[i] != INT_MAX){
                ans.push_back(nums[i]);
                int data = nums[i];
                nums[i] = INT_MAX;
                XXXCore(result,nums,ans);
                ans.pop_back();
                nums[i] = data;
            }
        }
    }
};

