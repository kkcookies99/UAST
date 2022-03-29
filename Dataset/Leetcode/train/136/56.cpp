 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int len=nums.size()-1;
        for(int i=0;;i+=2)
            if(i==len||nums[i]!=nums[i+1])
                return nums[i];
        return -1;
    }
};

