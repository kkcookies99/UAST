class Solution {
    void dp(vector<vector<int>>& res, vector<int> path, vector<int> nums,int begin, int l){
        if(l==0){
            res.push_back(path);
            return;
        }
        for(int i=begin;i<nums.size()-l+1;i++){
            path.push_back(nums[i]);
            dp(res,path,nums,i+1,l-1);
            path.pop_back();
        }
    }
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> path;
        for(int l=0;l<nums.size()+1;l++){
            dp(res,path,nums,0,l);
        }
        return res;
    }
};

