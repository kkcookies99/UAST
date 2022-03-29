class Solution {
public:
    int XXX(vector<int>& nums) {
        if(nums.size()==1) return nums[0];
        
        int dp[nums.size()];
         dp[nums.size()-1]=nums[nums.size()-1];
         int maxn=dp[nums.size()-1];
        for(int i=nums.size()-2;i>=0;i--){
            dp[i]=max(dp[i+1]+nums[i],nums[i]);
            maxn=max(dp[i],maxn);
        }
        return maxn;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


