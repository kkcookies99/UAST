class Solution {
public:

    vector<vector<int>> res;
    vector<int> nums;

    int path[21];
    bool st[21];

    void dfs(int u) {
        if(u == nums.size()) {
            vector<int> tmp;
            for(int i = 0; i < nums.size(); ++i)
                tmp.push_back(path[i]);
            res.push_back(tmp);
        }

        for(int i = 0; i < nums.size(); ++i)
            if(!st[i]) {
                path[u] = nums[i];
                st[i] = true;

                dfs(u + 1);

                st[i] = false;
            }
    }

    vector<vector<int>> XXX(vector<int>& n) {
        nums = n;
        dfs(0);
        return res;
    }
};

