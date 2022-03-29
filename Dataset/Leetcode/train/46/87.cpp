class Solution {
private:
    vector<int> temp;
    vector<vector<int>> res;
    vector<int> path;
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        temp=nums;
        dfs(nums);
        return res;
    }
    void dfs(vector<int>& nums){
        if(nums.empty()){
            res.push_back(path);
            return;
        }
        for(int i=0;i<nums.size();i++){
            path.push_back(nums[i]);
            int now=nums[i];
            nums.erase(nums.begin()+i);
            dfs(nums);
            path.pop_back();
            nums.insert(nums.begin()+i,now);
        }
    }
};