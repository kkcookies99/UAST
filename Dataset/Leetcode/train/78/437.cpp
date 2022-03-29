 class Solution {
public:
vector<vector<int>> res;
    vector<vector<int>> XXX(vector<int>& nums) {
         vector<int> ans;
        fun(nums,0,ans);
        return res;
    }
    void fun(vector<int>& nums,int index,vector<int>& ans){
        res.push_back(ans);
        for(int j=index;j<nums.size();j++){
            ans.push_back(nums[j]);
            fun(nums,j+1,ans);
            //从j开始往后取，并非index
            ans.pop_back();
        }
    }
};

