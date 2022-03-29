class Solution {
public:
    vector<vector<int>>res;
    int size;
    vector<bool>sta;
    vector<int>track;
    vector<vector<int>> XXX(vector<int>& nums) 
    {
        size=nums.size();
        sta.resize(size,false);
        dfs(nums);
        return res;
    }

    void dfs(vector<int>&nums)
    {
        if(track.size()==size)
        {
            res.push_back(track);
            return;
        }
        for(int i=0;i<size;i++)
        {
            if(!sta[i])
            {
                sta[i]=true;
                track.push_back(nums[i]);
                dfs(nums);
                track.pop_back();
                sta[i]=false;
            }
        }
    }
};

