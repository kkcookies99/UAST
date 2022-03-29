 class Solution {
public:
    bool XXX(vector<int>& nums) {
        if(nums.size()<=1){return true;}
        int farthest=nums[0],size=nums.size();
        for(int i=1;i<size;i++)
        {
            if(i<=farthest){farthest=max(farthest,i+nums[i]);}
            else{break;}
        }
        return farthest>=size-1;
    }
};

