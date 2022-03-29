class Solution {
public:
    int XXX(vector<int>& nums) {
       int max = nums[0];
       int z = nums[0];
       int len = sizeof(nums)/sizeof(nums[0]);
       //if(nums.size() == 1) return nums[0];
       if(len == 1) return nums[0];
       else{
            for(int i = 1;i < len;i++)
            {
                if(z < 0)
                {
                    z = nums[i];
                }
                else{
                    z = z + nums[i];
                }
                if(max < z) max = z;
            }
            return max;
            }
    }
};

