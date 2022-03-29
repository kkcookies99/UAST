 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int len=nums.size();
        int i=0;
        while(i<len)
        {
            if(nums[i]==val) 
            {
                nums.erase(nums.begin()+i);
            }
            else i++;
            if(i>=nums.size()) break;
            

        }
        return nums.size();

    }
};

