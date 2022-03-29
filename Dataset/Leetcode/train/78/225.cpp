class Solution {
private:
    vector<vector<int>> res;
    vector<int> path;
    void dfs(vector<int>& nums,int index){
        res.push_back(path);
        for(int i=index;i<nums.size();++i){
            path.push_back(nums[i]);
            dfs(nums,i+1);
            path.pop_back();
        }
    }
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        dfs(nums,0);
        return res;
    }
};

