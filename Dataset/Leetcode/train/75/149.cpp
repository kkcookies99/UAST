class Solution {
public:
    void XXX(vector<int>& nums) {
        int r,w,b;
        r = w = b =0;
        for(int i =0;i<nums.size();i++)
        {
            switch(nums[i])
            {
                case 0:r++;break;
                case 1:w++;break;
                case 2:b++;break;
            }
        }
        int i = 0;
        for(;i<r;i++)nums[i] = 0;
        for(;i<r+w;i++)nums[i] = 1;
        for(;i<nums.size();i++)nums[i] = 2;
    }
};

