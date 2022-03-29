 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        vector<int> res;
        int len=nums.size();
        for(int i=0;i<=len-1;i++)
        {
            for(int j=i+1;j<=len-1;j++)
            {
               if(nums[i]+nums[j]==target)
                res={i,j};
            }         
         }
                   return res; 
                
    }
};

