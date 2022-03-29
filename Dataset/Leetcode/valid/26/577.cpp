 class Solution {
public:
    int XXX(vector<int>& nums) {
        int len=0;
        for(int i=1;i<nums.size();i++)
            if(nums[i]!=nums[i-1])
                nums[++len]=nums[i];
        return (nums.size()==0?0:len+1);
    }
};

