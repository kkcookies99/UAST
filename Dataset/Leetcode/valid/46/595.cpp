 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> path;
        vector<bool> vis(nums.size(), false);
        function<void(int i)> get_path = [&](int k) {
            if(k == nums.size()) {
                res.push_back(path);
                return ;
            }

            for(int i = 0; i < nums.size(); ++i) {
                if(vis[i] == true) continue;
                vis[i] = true;
                path.push_back(nums[i]);
                get_path(k + 1);
                path.pop_back();
                vis[i] = false;
            }
        };
        get_path(0);
        return res;
    }
};

