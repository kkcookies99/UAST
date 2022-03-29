 class Solution {
public:

    bool notFound(vector<int> path, int target)
    {
        if(path.empty())
            return true;
        for(int i = 0; i < path.size(); i++)
        {
            if(path[i] == target)
                return false;
        }
        return true;
    }


    vector<vector<int>> XXX(vector<int>& nums) {
        int n = nums.size();
        vector<vector<int> > res;
        vector<int> path;
        if(n == 0)
            return res;
        dfs(nums,path, res, n);
        return res;
    }
    void dfs(vector<int>& nums, vector<int> &path,  vector<vector<int> > &res   ,int n)
    {
        if(path.size() == n)
        {
            res.push_back(path);
            return ;
        }

        for(auto num : nums)
        {
            if(notFound(path, num))
            {
                path.push_back(num);
                dfs(nums, path, res, n);
                path.pop_back();
            }
            
        }

    }


};

