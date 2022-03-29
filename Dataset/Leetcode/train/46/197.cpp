class Solution {
public:
    void backtrack(vector<vector<int>>& res, vector<int>& nums, int size,vector<int> q,vector<bool> c)
    {
        if (q.size() == size)
        {
            res.push_back(q);
        }
        else
        {
            for(int i(0);i<size;i++)
            {
                if (c[i] ==true)
                {
                    continue;
                }
                q.push_back(nums[i]);
                c[i] = true;
                backtrack(res, nums, (int)nums.size(),q,c);
                q.pop_back();
                c[i] = false;
            }

        }
    }

    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int> > res;
        vector<int> q;
        vector<bool> c(nums.size(),false);
        backtrack(res, nums, (int)nums.size(),q,c);
        return res;
    }
};

