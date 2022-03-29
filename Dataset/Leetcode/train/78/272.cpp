class Solution {
public:
vector<vector<int>> res;
vector<int> tmp;
    vector<vector<int>> XXX(vector<int>& nums) {
        int n = nums.size();
        res.push_back({});
        dfs(nums, 0);
        return res;
    }
    void dfs(vector<int>& nums, int index){
        if(index == nums.size()){
            return;
        }
        for(int i=index; i<nums.size(); ++i){
            tmp.push_back(nums[i]);
            res.push_back(tmp);
            dfs(nums, i + 1);
            tmp.pop_back();
        }
    }
};

