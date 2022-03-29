 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        dfs(nums,0,res);
        return res;
    }

    void dfs(vector<int>  nums,int pos , vector<vector<int>> & res) {
        if(pos == nums.size()){
            res.push_back(nums);
            return;
        }
        for(int i = pos; i < nums.size() ; i++){
            swap(nums[pos],nums[i]);
            dfs(nums,pos+1,res);
            swap(nums[pos],nums[i]);
        }
    }
};

