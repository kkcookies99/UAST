class Solution {
private:
    vector<int> path; 
    vector<vector<int>> result; 
public:
    void backtracking(vector<int>& nums) {
        // base case 
        if (path.size() == nums.size()) {
            result.push_back(path); 
            return; 
        }
        for (int i = 0; i < nums.size(); ++i) {
            auto it = find(path.begin(), path.end(), nums[i]); 
            if (it != path.end())
                continue; 
            path.push_back(nums[i]); 
            backtracking(nums); 
            path.pop_back(); 
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        backtracking(nums); 
        return result; 
    }
};

