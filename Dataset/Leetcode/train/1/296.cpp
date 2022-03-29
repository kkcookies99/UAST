 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        vector<int> ans, temp;
        if(target == 0) {
            for(int i = 0;i < nums.size();i++) {
                if(nums[i] == 0) ans.emplace_back(i);
                if(ans.size() == 2) return ans;
            }
        }
        dfs(nums, ans, temp, 0, target);
        return ans;
    }
    void dfs(vector<int>& nums, vector<int>& ans, vector<int>& temp, int pos, int target) {
        if(temp.size() == 2 && target == 0) {
            for(int tmp : temp) ans.emplace_back(tmp);
            return;
        }
        else if (temp.size() < 2 && ans.size() == 0) {
            for(int i = pos; i < nums.size(); i++) {
                temp.emplace_back(i);
                dfs(nums, ans, temp, i+1, target - nums[i]);
                temp.pop_back();
            }
        }
    }
};

