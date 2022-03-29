 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> track;
        backtrack(res, track, nums);
        return res;
        
    }
    void backtrack(vector<vector<int>>& res, vector<int> track, vector<int> nums) {
        if (track.size() == nums.size()) {
            res.push_back(track);
        }
        for (int i =0; i < nums.size(); i++) {
            auto it = find(track.begin(), track.end(), nums[i]);
            if (it != track.end()) {
                continue;
            }
            track.push_back(nums[i]);
            backtrack(res, track, nums);
            track.pop_back();
        }
    }
};

