class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> result;
        vector<int> path;
        vector<bool> used(nums.size(),false);
        function<void()> dfs = [&](){
            if(path.size()==nums.size()){
                result.push_back(path);
                return ;
            }
            for(int i=0;i<nums.size();i++){
                if(used[i]) continue;
                used[i] = true;
                path.push_back(nums[i]);
                dfs();
                path.pop_back();
                used[i]= false;
            }
        };
        dfs();
        return result;
    }
};```

