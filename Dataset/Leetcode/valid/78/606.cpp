 class Solution {
public:
    vector<vector<int>> vv;
    vector<int> v;
    void dfs(vector<int>& nums,int k,int index)
    {
        if(index==k)
        {
            vv.push_back(v);
        }
        else
        {
            for(int i=0;i<nums.size();i++)
            {
                if(v.empty()||nums[i]>v[index-1])
                {
                    v.push_back(nums[i]);
                    dfs(nums,k,index+1);
                    v.pop_back();
                }
            }
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        int len = nums.size();
        sort(nums.begin(),nums.end());
        for(int i=0;i<=len;i++)
        {
            v.clear();
            dfs(nums,i,0);
        }
        return vv;
    }
};

