class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int> > res;
        res.push_back(vector<int>());
        int size = nums.size();
        for(int i = 0;i<size;++i)
        {
            int curLen = res.size();
            for(int j = 0;j<curLen;++j)
            {
                vector<int> t = res[j];
                t.push_back(nums[i]);
                res.push_back(t);
            }
        }
        return res;
    }
};

