class Solution {
public:
    vector<vector<int>>res;
    vector<int>path;
    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.size()==0) return res;
        dfs(nums,0);
        return res;
    }
    void dfs(vector<int>&nums,int u){
       if(nums.size()==u){
           res.push_back(path);
           return;
       }
       dfs(nums,u+1);//不选择这个数，直接遍历下一个数
       path.push_back(nums[u]);//如果选择这个数，就加入到path数组中，再遍历第二个数
        dfs(nums,u+1);
        path.pop_back();
    }
};

