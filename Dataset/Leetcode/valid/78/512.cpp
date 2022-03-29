 class Solution {
public:
    int n;
    vector<vector<int>> ans;
    vector<bool> flag;
    vector<int> Sub;
    int len = 1;
    vector<vector<int>> XXX(vector<int>& nums) {
        n = nums.size();
        
        flag = vector<bool>(n,false);

        dfs(nums,0);
        return ans;
    }
    void dfs(vector<int>& nums,int start)
    {
        ans.push_back(Sub);

        for(int i = start; i<n ;i++)
        {
            if(!flag[i])
            {
                Sub.push_back(nums[i]);
                flag[i] = true;
                
                dfs(nums,i+1);
                Sub.pop_back();
                flag[i] = false;
            }
        }
    }
};

