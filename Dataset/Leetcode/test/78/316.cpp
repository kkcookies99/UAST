class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        ans.push_back({});//空集是任何集合的子集
        dfs(0,nums);
        return ans;
    }

    void dfs(int startIndex,vector<int>& nums)
    {
        if(startIndex == nums.size())
        {
            return ;
        }
        for(int i = startIndex; i < nums.size();++i)
        {
            path.push_back(nums[i]);
            ans.push_back(path);//在树的每个节点都收集结果
            dfs(i + 1,nums);
            path.pop_back();
        }
        return;
    }
private:
    vector<vector<int>> ans;
    vector<int> path;
};

