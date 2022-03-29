 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int curpos=0;
        while(curpos+nums[curpos]<nums.size()-1)
        {
            int temp=curpos;
            for(int i=curpos+1;i<=curpos+nums[curpos];i++)
            {
                if(i==nums.size()-1)
                    return true;
                curpos=(nums[i]+i)>(curpos+nums[curpos])?i:curpos;
            }
            if(temp==curpos&&curpos+nums[curpos]!=nums.size()-1)
                return false;
        }
        return true;
    }
};

