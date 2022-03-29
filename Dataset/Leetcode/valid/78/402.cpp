 class Solution {
public:
    vector<vector<int>> ans;
    map<int,int> vis;
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int> a;
        ans.push_back(a);
        for(int i=1;i<=nums.size();i++)
        {
            res(nums,i,0,a);
        }
        return ans;
    }
    void res(vector<int> nums,int len,int pos,vector<int> state)
    {
        if(len==0) ans.push_back(state);
        else
        for(int i=pos;i<nums.size();i++)
        {
            if(!vis[nums[i]])
            {
                vis[nums[i]]=1;
                state.push_back(nums[i]);
                if(nums.size()-i>=len)
                res(nums,len-1,i+1,state);
                state.pop_back();
                vis[nums[i]]=0;
            }
        }
    }
};

