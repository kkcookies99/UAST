class Solution {
private:
    vector<vector<int> > res;
    vector<int> path;
public:
    void dfs(vector<int>& nums,vector<int> &path,int n){
        res.push_back(path);
        for(int i=n;i<nums.size();i++){
            path.push_back(nums[i]);
            dfs(nums,path,i+1);
            path.pop_back();
        }
    } 
    vector<vector<int>> XXX(vector<int>& nums) {
        dfs(nums,path,0);
        return res;
    }
};

