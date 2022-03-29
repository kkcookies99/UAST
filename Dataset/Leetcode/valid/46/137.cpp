class Solution {
public:
    vector<vector<int>> res;
    vector<vector<int>> XXX(vector<int>& nums) {
        if(!nums.empty())
            dfs(nums,0);
        return res;
    }
    
    void dfs(vector<int>& nums,int begin){
        if(begin==nums.size()){
            res.push_back(nums);
            return;
        }
        for(int i=begin;i<nums.size();i++){
            swap(nums[i],nums[begin]);
            dfs(nums,begin+1);
            swap(nums[i],nums[begin]);
        }
        
    }
};
`
