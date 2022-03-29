class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        return XXX(nums, 0, nums.size());
    }

    vector<vector<int>> XXX(vector<int>& nums, int start, int end) {
        if (end - start == 1)
        {
            return { { nums[start] } };
        }
        else
        {
            auto subset = XXX(nums, start, end - 1);
            vector<vector<int>> result;
            for (auto& item : subset)
            {
                for (int i = 0; i <= item.size(); i++)
                {
                    vector<int> newItem = item;
                    newItem.insert(newItem.begin() + i, nums[end-1]);
                    result.push_back(move(newItem));
                }
            }
            return result;
        }
    }
};

