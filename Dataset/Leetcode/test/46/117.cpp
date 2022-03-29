class Solution {
public:
    vector<int>tmp;
    vector<vector<int>>res;
    vector<vector<int>> XXX(vector<int>& nums) {
        dfs(nums);
        return res;
    }

    void dfs(vector<int>& nums){
        if(tmp.size()==nums.size()) {
            res.push_back(tmp);
            return ;
        }

        for(int i=0;i<nums.size();i++){
            if(find(tmp.begin(),tmp.end(),nums[i])!=tmp.end()) continue;
            tmp.push_back(nums[i]);
            dfs(nums);
            tmp.pop_back();
        }
    }
};

