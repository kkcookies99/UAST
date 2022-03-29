 class Solution {
public:
    vector<vector<int>> res;
    vector<vector<int>> XXX(vector<int>& nums) {
        //使用dfs
        vector<int> used(nums.size());//初始化一个bool作用的vector，用于标记哪些元素是使用过的
        dfs(nums,used);
        return res;
    }
    vector<int> temp;
    void dfs(vector<int>& nums,vector<int>& used){
        //结束条件
        if(temp.size() == nums.size()) {
            res.push_back(temp);
            return;
        }
        for(int i = 0; i<nums.size(); i++){
            if(!used[i]){
                temp.push_back(nums[i]);
                used[i] = 1;
                dfs(nums, used);
                temp.pop_back();
                used[i] = 0;
            }
        }
    }
};

