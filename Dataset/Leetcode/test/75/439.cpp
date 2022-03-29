 class Solution {
public:
    void XXX(vector<int>& nums) {
        int l = 0;
        int r = nums.size()-1;
        for(int i = 0;i<nums.size();){
            if (nums[i]==0){
                if(l<i){
                swap(nums[i],nums[l]);
                l++;
                }else i++;    
            }else if (nums[i]==2){
                if(i<r){
                swap(nums[i],nums[r]);
                r--;
                }else i++;
            }else{
                i++;
            }
        }
    }
};

