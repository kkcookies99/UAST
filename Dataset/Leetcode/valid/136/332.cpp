 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        if(nums.size()==1)return nums[0];
        sort(nums.begin(),nums.end());
        int left=0,right=nums.size()-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(mid%2==0){
                if(nums[mid]==nums[mid+1]) left=mid+2;
                else  right=mid;
            }
            else{
                if(nums[mid]==nums[mid-1]) left=mid+1;
                else right=mid-1;
            }
        }
        return nums[left];
    
    }
};

