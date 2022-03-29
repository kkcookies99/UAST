class Solution {
public:
    vector<vector<int>>  res;
    vector<int> temp;

    vector<vector<int>> XXX(vector<int>& nums) {
        dfs(nums,0);
        return res;
    }

    void dfs(vector<int>& nums,int nowindex) {
        if(nowindex>=nums.size()) {res.push_back(temp);return;}

        for(int i=nowindex;i<nums.size();i++){
            temp.push_back(nums[i]);
            swap(nums[i],nums[nowindex]);
            dfs(nums,nowindex+1);
            swap(nums[i],nums[nowindex]);
            temp.pop_back();
        }

    }
    
};

