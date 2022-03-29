class Solution {
public:
    vector<int> temp;
    vector<int> path;
    vector<vector<int>> ans;
    int sizeMAX;
    void dfs(vector<int>& nums){

        if(temp.size() == sizeMAX)
        {
            ans.push_back(temp);
            return;
        }
        for(int i = 0; i < nums.size(); i++)
        {
            if(path[i] == 0)
            {
                temp.push_back(nums[i]);
                path[i] = 1;
                dfs(nums);
                temp.pop_back();
                path[i] = 0;
            }
        }
        return;
    }


    vector<vector<int>> XXX(vector<int>& nums) {
        sizeMAX = nums.size();
        path.resize(nums.size());
        dfs(nums);
        return ans;
    }
};


