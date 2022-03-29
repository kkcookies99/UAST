 class Solution {
public:
    void swap(vector<int>& nums,int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
    int XXX(vector<int>& nums) {
        if(nums.size()<2)return nums.size();
        int l=0,r=1;
        while(r<nums.size()){
            if(nums[l]==nums[r])r++;
            else{
                swap(nums,++l,r++);
            }
        }
        return ++l;
    }
};

//假如修改原数组
class Solution {
public:
    int XXX(vector<int>& nums) {
        if(nums.size()<2)return nums.size();
        int l=0,r=1;
        while(r<nums.size()){
            if(nums[l]==nums[r])r++;
            else nums[++l]=nums[r++];
        }
        return ++l;
    }
};

