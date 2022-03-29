 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int ans = 0;
        if(nums.size()==1) return nums[0];
        for(int i=0;i<nums.size();i++){
            if(nums[i]!=nums[i+1]){
                ans = nums[i];
                break;
            }else{
                i++;
            }
        }
        return ans;
    }
};

