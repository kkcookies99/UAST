class Solution {
public:
    vector<int> temp;
    vector<vector<int>> res;
    vector<vector<int>> XXX(vector<int>& nums) {
        dfs(nums,0,nums.size()-1);
        return res;
    }
    void dfs(vector<int>& nums,int left,int right){
        res.push_back(temp);
        for(int i=left;i<=right;i++){
            temp.push_back(nums[i]);
            dfs(nums,i+1,right);
            temp.pop_back();
        }
        return;
    }
};

