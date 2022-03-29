 class Solution {
public:
    int n;
    vector<int> path;
    vector<int> nums;
    vector<vector<int>> ans;
    vector<bool> st;

    void dfs(int x)
    {
        if(x == n)
        {
            ans.push_back(path);
            return;
        }

        for(int i=0; i<n; i++)
        {
            if(st[i]) continue;
            st[i] = true;
            path[x] = nums[i];
            dfs(x+1);
            st[i] = false;
        }
    }

    vector<vector<int>> XXX(vector<int>& _) {
        nums = _;
        path = nums;
        n = nums.size();
        st.assign(n, false);
        dfs(0);
        return ans;
    }
};

