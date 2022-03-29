 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int size = nums.size();
        int sum = 0;
        for(int i = 0;i < size;i++)
        {
            while(size-1 > i && nums[size-1] == val) size--,sum++;
            if(size > 0 && nums[i] == val) nums[i] = nums[--size],sum++;
        }
        return nums.size()-sum;
    }
};

