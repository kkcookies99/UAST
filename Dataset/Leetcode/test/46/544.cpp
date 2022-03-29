 class Solution {
public:

    void dfs(vector<int> &nums, int index, vector<int> &temp, vector<vector<int>> &list) {
        if (index == nums.size()) {
            list.push_back(temp);
            return;
        }
        for (int i = index; i < nums.size(); i++) {
            swap(nums[i], nums[index]);
            temp.push_back(nums[index]);
            dfs(nums, index + 1, temp, list);
            temp.pop_back();
            swap(nums[i], nums[index]);
        }
    }

    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> vecList;
        vector<int> vec;
        dfs(nums, 0, vec, vecList);
        return vecList;
    }
};

