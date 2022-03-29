 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<vector<int>>result;
        int len = nums.size();
        for(int i=0;i<len;i++){
            if(nums[i]>0) return result;
            if(i>0 && nums[i] == nums[i-1]) continue;
            int l = i+1,r=len-1;
            while(l<r){
                if(nums[i]+nums[l]+nums[r]==0){
                    result.push_back({nums[i],nums[l],nums[r]});
                    l++;
                    r--;
                    while(nums[l]==nums[l-1]&&l<r) l++;
                    while(nums[r]==nums[r+1]&&l<r) r--;
                }else if(nums[i]+nums[l]+nums[r]<0) l++;
                else r--;
            }
        }
        return result;
    }
};

