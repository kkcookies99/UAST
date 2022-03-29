class Solution {
public:
    int n;
    vector<vector<int>> ans;
    vector<vector<int>> XXX(vector<int>& nums) {
        n = nums.size();
        vector<bool> visited(n, false);
        vector<int> interval;
        dfs(nums, visited, 0, interval);
        return ans;
    }
    void dfs(vector<int> &nums, vector<bool> & visited, int index, vector<int> interval)
    {
        if(index == n)
        {
            ans.push_back(interval);
        }
        for(int i=0;i<n;i++)
        {
            if(visited[i] == false)
            {
                interval.push_back(nums[i]);
                visited[i] = true;
                dfs(nums, visited, index+1, interval);
                interval.pop_back();
                visited[i] = false;
            }            
        }
    }
};

