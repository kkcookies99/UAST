 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        auto size = nums.size();
        int num = 0;
        for(int i = 0;i<size-num;i++)
        {
            if(nums[i] == val)
            {
                for(int j = i+1;j<size-num;j++)
                {
                    nums[j-1] = nums[j];
                }
                num++;
                i--;
            }
        }
        return size-num;
    }
};

