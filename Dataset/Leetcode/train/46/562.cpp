 class Solution {
public:
    vector<vector<int>> res;
    vector<int> newNum;

    // 路径：记录在 track 中
    // 选择列表：nums 中不存在于 track 的那些元素
    // 结束条件：nums 中的元素全都在 track 中出现
    void BackTrack(vector<int> nums, vector<int> track) {
        // 触发结束条件
        if (track.size() == nums.size()) {
            res.push_back(track);
            return;
        }
        for (int i = 0; i < nums.size(); i++) {
            if (find(track.begin(), track.end(), nums[i]) != track.end()) {
                continue;
            }
            // 排除不合法的选择
            track.push_back(nums[i]);
            // 进入下一层决策树
            BackTrack(nums, track);
            // 取消选择
            track.pop_back();
        }
    }

    vector<vector<int>> XXX(vector<int> &nums) {
        // 记录 路径
        vector<int> track;
        BackTrack(nums, track);
        return res;
    }
};
'''
