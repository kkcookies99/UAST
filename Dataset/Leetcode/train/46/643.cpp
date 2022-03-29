 class Solution {
public:
    void dfs(vector<int>&nums,vector<int>&used,int depth,vector<vector<int>>&res,vector<int>&temp)
    {
        if(depth==nums.size())
        {
            res.push_back(temp);
            return;
        }
        for (int i=0;i<nums.size();++i)
        {
            if (used[i] == 0)
            {
                used[i] = 1;
                temp.push_back(nums[i]);
                dfs(nums,used,depth+1,res,temp);
                used[i] = 0;
                temp.pop_back();
            }
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int>temp;
        if(nums.size()==0)
        return res;
        vector<int>used(nums.size(),0);
        dfs(nums,used,0,res,temp);
        return res; 
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


