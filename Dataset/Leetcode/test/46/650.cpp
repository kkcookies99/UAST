 class Solution {
public: 
    void dfs(int idx,vector<int>&nums,vector<int>&mute,vector<vector<int>>&res){
        if(idx==nums.size()){
            res.push_back(mute);
            return;
        }
        for(int i=idx;i<nums.size();i++){
            swap(nums[i],nums[idx]);
            mute.push_back(nums[idx]);
            dfs(idx+1,nums,mute,res);
            swap(nums[i],nums[idx]);
            mute.pop_back();
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>>res;
        vector<int>mute;
        dfs(0,nums,mute,res);
        return res;
    }
};

