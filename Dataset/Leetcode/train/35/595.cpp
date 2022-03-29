 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int min=0,max=nums.size()-1;
        int i;
        while(min<=max)
        {
            i=(max+min)/2;
            if(target>nums.at(i))
            {
                min=i+1;
            }
            if(target<nums.at(i))
            {
                max=i-1;
            }
            if(target==nums.at(i))
            {
                return i;
            }
                
        }
        if(min>max)
            return max+1;
        return max;
    }
};

