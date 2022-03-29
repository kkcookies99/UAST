class Solution {
public:
    void XXX(vector<int>& nums) {
        int l=-1,r=nums.size(),i=0;
        while(i<r){
            if(nums[i]<1){
                swap(nums[i++],nums[++l]);
            }else if(nums[i]>1){
                swap(nums[i],nums[--r]);
            }else{
                ++i;
            }
        }
    }
};

