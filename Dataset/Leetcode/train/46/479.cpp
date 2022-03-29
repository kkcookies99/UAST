 class Solution {
public:
    vector<vector<int>>res;
    vector<vector<int>> XXX(vector<int>& nums) {
        bool *visited=new bool[nums.size()];
        for(int i=0;i<nums.size();i++)
        visited[i]=0;
        DFS(visited,nums,{});
        return res;
    }

    void DFS(bool visited[],vector<int>&nums,vector<int> path)
    {
        if(path.size()==nums.size())
        {
            res.push_back(path);
            return;
        }
        for(int i=0;i<nums.size();i++)
        {
            if(!visited[i])
            {
                path.push_back(nums[i]);
                visited[i]=1;
                DFS(visited,nums,path);
                path.pop_back();
                visited[i]=0;
            }
        }
    }
};

