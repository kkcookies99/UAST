 class Solution {
public:
    vector<vector<int>> finalResult;
    int N;
    void dfs(int count,vector<int> result,int k,vector<int>& nums)
    {
        if(!count)
            finalResult.push_back(result);
        else
        {
            if(N-k<count)
                return;
            for(int i=k;i<N;++i)
            {
                result.push_back(nums[i]);
                dfs(count-1,result,i+1,nums);
                result.pop_back();
            }
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        N=nums.size();
        vector<int> result;
        for(int i=0;i<=N;++i)
            dfs(i,result,0,nums);
        return finalResult;
    }
};

