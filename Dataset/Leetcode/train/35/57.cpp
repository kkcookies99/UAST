 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        if(target>nums[nums.size()-1])
        return nums.size();
        if(target<=nums[0])
        return 0;
        int begin=0,end=nums.size()-1,index,pos,n=nums.size()-1;
        while(begin<end)
        {
            pos=(begin+end)/2;
            if(nums[pos]>target)
            end=pos-1;
            if(nums[pos]<target)
            begin=pos+1;
            if(begin<=1||end>=n-1)
            break;
        }
        if(target>nums[begin])
        {
            int i=begin;
            while(nums[i]<target)
            {
                i++;
            }
            return i;
        }
        return begin;
    }
};

