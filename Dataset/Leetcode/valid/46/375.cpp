class Solution {
public:
    unordered_set<int> s;
    vector<int> combination;
    vector<vector<int>> combinations;
    void dfs(vector<int>& nums) {
        if(combination.size()==nums.size()) {
            combinations.emplace_back(combination);
            return;
        }
        for(int i=0;i<nums.size();i++) {
            if(!s.count(i)) {
                combination.emplace_back(nums[i]);
                s.insert(i);
                dfs(nums);
                s.erase(i);
                combination.pop_back();
            }         
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        dfs(nums);
        return combinations;
    }
};

