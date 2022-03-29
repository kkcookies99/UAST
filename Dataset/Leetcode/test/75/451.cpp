 class Solution {
public:
    void XXX(vector<int>& nums) {
        std::ios::sync_with_stdio(false);
        for (int a = 0; a < nums.size()-1; a++)
        {
            int b = a + 1, c = nums.size() - 1;
            while (b <= c)
            {
                if (nums[a] > nums[b])swap(nums[a], nums[b]);
                if (nums[b] > nums[c])swap(nums[c], nums[b]);
                if (nums[a] > nums[b])swap(nums[a], nums[b]);
                b++;
            }
        }
    }
};

