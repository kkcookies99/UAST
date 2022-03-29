 class Solution {
public:
	int singleNumber(vector<int>& nums) {
		
		sort(nums.begin(), nums.end());
		for (vector<int>::iterator it = nums.begin(); it != nums.end();)
		{
			if (*it == *(it+1))
			{
				it += 2;
			}
			else
			{
				return *it;
			}
		}
		return -1;
	}
};

