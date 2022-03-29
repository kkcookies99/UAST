 class Solution {
public:
    int XXX(vector<int>& nums)    
    {        
        if((int)nums.size() == 0) return 0;
        int a = 0;
        for(int i = 1; i < nums.size(); i++)            
        {
            if(nums[i] > nums[a])
            {                
                a++;
                nums[a] = nums[i];
            }
        }
        return a+1;
    }
};

