 class Solution {
public:
    set<int> set;
    vector<int> temp;
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        dfs(0,ans,nums);
        return ans;
    }

    void dfs(int k,vector<vector<int>> &ans,vector<int>& nums){
        if (k==nums.size()){
            ans.push_back(temp);
            return;
        }
        for (int i = 0; i < nums.size(); ++i) {
            if (set.count(i)){
                continue;
            }
            temp.push_back(nums[i]);
            set.insert(i);
            dfs(k+1,ans,nums);
            set.erase(i);
            temp.pop_back();
        }
    }
};

