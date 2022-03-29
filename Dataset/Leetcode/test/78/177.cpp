class Solution {
public:
    void dfs(vector<vector<int>> &result, vector<int> &nums, vector<int> &buf, int pos) {
        if (pos == nums.size()) {
            result.push_back(buf);
            return;
        }

        buf.push_back(nums[pos]);
        dfs(result, nums, buf, pos+1);
        buf.pop_back();
        dfs(result, nums, buf, pos+1);
    }

    vector<vector<int>> XXX(vector<int> &nums) {
        vector<vector<int>> result;
        vector<int> buf;
        dfs(result, nums, buf, 0);
        return result;
    }
};

