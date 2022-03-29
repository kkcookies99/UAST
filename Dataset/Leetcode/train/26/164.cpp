 class Solution {
public:
    int XXX(vector<int>& nums) {
        int num = nums.size();
        int point = 1;
        for(int i = 1; i < nums.size(); ++i)
        {
            if(nums[i] == nums[i - 1])
                {
                   num--;   
                }    
            else 
                {
                    
                nums[point] = nums[i];
                point++;
                }
               
        }
        return num;  
               
    }
};

