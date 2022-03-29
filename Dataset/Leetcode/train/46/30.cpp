class Solution {
public:
    vector<vector<int>> res;
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int> track = {};
        vector<bool> visited(nums.size(), false);
        dfs(nums, track, visited);
        return res;
    }

    void dfs(vector<int>& nums, vector<int>& track, vector<bool>& visited) {
        // 遍历到底了
        if(nums.size() == track.size()) {
            res.push_back(track);
            return;
        }
        for(int i = 0; i < nums.size(); ++i) {
            if(!visited[i]) {
                // 前序，添加当前节点到track
                visited[i] = true;
                track.push_back(nums[i]);
                dfs(nums, track, visited);
                // 后序，处理完当前节点以后回溯
                visited[i] = false;
                track.pop_back();
            }
        }
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


