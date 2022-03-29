class Solution {
public:
    bool XXX(vector<int>& nums) {
        int index = nums.size() - 1;
        for (int i = index - 1; i >= 0; --i)
        {
            if (nums.at(i) >= index - i) index = i;
        }

        return index == 0;
    }
};

