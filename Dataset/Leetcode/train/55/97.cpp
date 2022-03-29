class Solution {
public:
    bool isOk(int i, int j,vector<bool>& dp, vector<int>& nums)
    {
        if(dp[j] == true)
        {
            if((i-j)<=nums[j])
            {
                dp[i]=true;
                return true;
            }
        }
        return false;
    }


    bool XXX(vector<int>& nums) {
	if (nums[0] == 0 && nums.size()==1){
		return true;
	}
    
        vector<bool> dp(nums.size(),false);
        dp[0]=true;
        dp[1]=true;
        for(int i =1;i<nums.size();i++)
        {
            for(int j=0;j<i;j++)
            {
                if(!isOk(i,j,dp,nums))
                   { continue;}
                   else{
                       break;
                   }
            }     
        }
        return dp[nums.size()-1];
    }
};

