 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> v;
        vector<int> tmp;
        for(int i = 0;i<nums.size();++i)
        {
            
            int size = v.size();
            for(int j = 0;j<size;j++)
            {
                tmp = v[j];
                tmp.push_back(nums[i]);
                v.push_back(tmp);
            }
            tmp.clear();
            tmp.push_back(nums[i]);
            v.push_back(tmp);
        }
        tmp.clear();
        v.push_back(tmp);
        return v;
    }
};

