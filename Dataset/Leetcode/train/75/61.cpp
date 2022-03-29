class Solution {
public:
    void XXX(vector<int>& nums) {
        if (nums.size() >= 2)
        {
            int a = 0, b = nums.size() - 1;
            for (int i = 0; i < nums.size(); i++)
            {
                if (i > b)
                    break;
                if (nums[i] == 0)
                {
                    swap(nums[i], nums[a]);
                    a++;
                }

                if (nums[i] == 2)
                {
                    while (nums[b] == 2 && b > i)
                        b--;
                    swap(nums[i], nums[b]);
                    b--;
                    if (nums[i] == 0)
                    {
                        swap(nums[i], nums[a]);
                        a++;
                    }
                }
            }
        }
    }
};

