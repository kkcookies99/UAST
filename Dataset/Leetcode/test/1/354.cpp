 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        vector<int> Sum;
        for(vector<int>::size_type i = 0; i != nums.size(); ++i)
            for(vector<int>::size_type j = i + 1; j != nums.size(); ++j)
                if(nums[i] + nums[j] == target)
                {
                    Sum.push_back(i);
                    Sum.push_back(j);
                }
        return Sum;
    }
};

