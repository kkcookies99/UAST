class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> result;
        vector<int> path;
        function<void(int start)> dfs = [&](int start){
            result.push_back(path);
            if(start>=nums.size()){
                return ;
            }
            for(int i = start;i<nums.size();i++){
                path.push_back(nums[i]);
                dfs(i+1);
                path.pop_back();
            }
        };
        dfs(0);
        return result;
    }
};```

