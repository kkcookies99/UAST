 class Solution {
public:
    int XXX(vector<int>& nums) {
        int res=INT_MIN;
        for(int i=0;i<nums.size();i++){
            if(i>0&&nums[i-1]>0) nums[i]+=nums[i-1];
            res=res>nums[i]?res:nums[i]; 
        }
        return res;
    }
};

