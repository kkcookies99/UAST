class Solution {
private:
    void backtracking(vector<int>& nums, 
                      vector<int>& track,
                      vector<vector<int>>& res) {
        if(nums.size() == track.size()) {
            res.push_back(vector<int>(track));
            return;
        }
        for(int i=0; i<nums.size(); ++i) {
            // 当前节点已遍历过
            if(find(track.begin(), track.end(), nums[i])!=track.end())
                continue;
            // 回溯
            track.push_back(nums[i]);
            backtracking(nums, track, res);
            track.pop_back();
        }
    }

public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int> track;
        vector<vector<int>> res;
        backtracking(nums, track, res);
        return res;
    }
};

