 class Solution {
public:
    vector<vector<int>> res;
    vector<int> path;
    vector<bool> st;
    int n;
    vector<vector<int>> XXX(vector<int>& nums) {
        //注意初始化数组大小，
        n = nums.size();
        st.resize(n);
        path.resize(n);
        dfs(nums,0);
        return res;
    }

    void dfs(vector<int>& nums,int u){
        if(u == n){
            res.push_back(path);
            return;
        }
        for(int i = 0; i < n; i ++)
            if(st[i] == false){
                st[i] = true;
                path[u] = nums[i];
                dfs(nums,u + 1);
                st[i] = false;
            }
    }
};

