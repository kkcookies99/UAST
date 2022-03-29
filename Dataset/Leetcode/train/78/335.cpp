class Solution {
private:
    vector<vector<int>> vecRes;
    vector<int> vecNums;

public:
    vector<vector<int>> XXX(vector<int>& nums) {
        XXX(nums, 0);
        return vecRes;
    }

    void XXX(vector<int> &nums, int index)
    {
        if(index <= nums.size())
        {
            vecRes.push_back(vecNums);
        }

        for(int i = index; i < nums.size(); ++i)
        {
            vecNums.push_back(nums[i]);
            XXX(nums, i + 1);
            vecNums.pop_back();
        }
    }
};

