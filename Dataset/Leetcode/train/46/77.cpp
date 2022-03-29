class Solution {
public:
    bool v[6];
    int sum=0,meb[6];
    void dfs(int step,vector<int> &nums,int n,vector<vector<int>> &result)
    {
        if(step>=n)
        {
            result.resize(result.size()+1);
            for(int i=0;i<step;i++)
            {
                result[sum].resize(result[sum].size()+1);
                result[sum][i]=meb[i];
            }
            sum++;
            return ;
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                if(v[i]!=false)
                {
                    meb[step]=nums[i];
                    v[i]=false;
                    dfs(step+1,nums,n,result);
                    v[i]=true;
                }
            }
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        for(int i=0;i<6;i++)
        {
            v[i]=true;
            meb[i]=0;
        }
        vector<vector<int>>result(0,vector<int>(0));
        dfs(0,nums,nums.size(),result);
        return result;
    }
};

