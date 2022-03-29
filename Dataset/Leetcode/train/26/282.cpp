 class Solution {
public:
    int XXX(vector<int>& nums) 
    {   if(nums.size()==0)
        return 0;
        int num=nums[0];
        int j=0;
        for(int i=1;i<nums.size();i++)
        {   
            while(nums[i]!=num)
            {
             nums[++j]=nums[i];      //用++j比j++效率更高
             num=nums[i]; 
            }
        }
        return j+1;
    }
};

