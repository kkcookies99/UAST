 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int i=0,l=0;
        while(i<nums.size() && l<nums.size()){
            while(nums[i]==val && l<nums.size()){
                swap(nums[i],nums[l++]);
            }
            i++;l=i+1;
        }
        int cnt=0;
        for(int num:nums){
            cnt+=num==val;
        }
        return nums.size()-cnt;
    }
};

