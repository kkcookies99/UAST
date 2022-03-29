 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int i=0;
        int p=0;
        int length=nums.size();
        for(i;i<length;i++){
            if(nums[i]!=val)
                nums[p++]=nums[i];
        }
        return p;
    }
};

