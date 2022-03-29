 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        vector<int> a(0);
        for(int i=0; i<sizeof(nums); i++)
        {
            for(int j=i+1; j<sizeof(nums); j++)
            {
                if(nums[i] + nums[j]==target)
                {
                    a.push_back(i);
                    a.push_back(j);
                    return a;
                }
            }
        }
        return a;
    }
   
};

