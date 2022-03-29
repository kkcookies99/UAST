class Solution {
public:
    int XXX(vector<int>& nums) {
        int nums_size=nums.size();
        vector<int>max_subarray(nums_size);
        max_subarray[0]=nums[0];
        int max=max_subarray[0];
        for(int j=1;j<nums_size;j++){
            max_subarray[j]=nums[j]>(max_subarray[j-1]+nums[j])?nums[j]:(max_subarray[j-1]+nums[j]);
            max=max_subarray[j]>max?max_subarray[j]:max;
        }
        return max;
    }
};

