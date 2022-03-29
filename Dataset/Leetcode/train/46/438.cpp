 class Solution {
public:
    void backtrack(vector<vector<int>> &res, vector<int> &nums, vector<int>&path,unordered_map<int,int>&map){
        int n = nums.size();
        if (path.size() == nums.size()){
            res.push_back(path);
            return;
        }
        for (int i = 0; i < n; i++){
            if (map.find(nums[i]) != map.end()){
                continue; 
            }
            path.push_back(nums[i]);
            map.emplace(nums[i], nums[i]);
            backtrack(res, nums, path,map);
            map.erase(nums[i]);
            path.pop_back();
        }
    }



    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> path;
        unordered_map<int, int> map;
        backtrack(res, nums, path, map);
        return res;
    }
};

