class Solution {
public:
    void XXX(vector<int>& nums) {
        //双指针操作；
        int left=0,right=nums.size()-1;
        for(int i=0;i<=right;i++){
            if(nums[i]==0)
                swap(nums[i],nums[left++]);
            else if(nums[i]==2)
                swap(nums[i--],nums[right--]);
        }
    }
};

