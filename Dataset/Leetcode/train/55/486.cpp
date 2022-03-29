 class Solution {
public:
    bool XXX(vector<int>& nums) {
	int n = nums.size();
	vector<int>dp(n,0);
	dp[0] = 1;

	for (int i=1;i<n;++i)
	{
		int k = i;
		while (k>0) 
		{
			--k;
			if (nums[k]>=(i-k))
			{
				dp[i] = 1;
				break;
			}
		}
		if (dp[i]==0)
		{
			return 0;
		}
	}
	return 1;
    }
};

