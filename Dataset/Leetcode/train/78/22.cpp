class Solution {
public:
    int n;
    vector<vector<int>> ans;
    vector<int> temp;
    vector<int> nums;
    vector<vector<int>> XXX(vector<int>& nums) {
        this->nums = nums;
        n = nums.size();
        dfs(0);
        return ans;
    }
    void dfs(int x){
        if(x==n){
            ans.emplace_back(temp);
            return;
        }
        dfs(x+1);//不选
        temp.emplace_back(nums[x]);
        dfs(x+1);//选
        temp.pop_back();
    }
};

