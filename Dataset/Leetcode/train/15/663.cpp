 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
	if (nums.size() < 3) return {};
    vector<vector<int>> ret;
	sort(nums.begin(), nums.end());
	for (int i = 0; i < nums.size(); i++)
	{
		if (i != 0 && nums[i] == nums[i - 1]) continue;
        if(nums[i] > 0) return ret;
        
		int left = i + 1;
		int right = nums.size() - 1;
		int target = -nums[i];
		while (left < right)
		{
			if (nums[left] + nums[right] < target)
			{
				left++;
			}
			else if (nums[left] + nums[right] > target)
			{
				right--;
			}
			else
			{
				ret.push_back({ nums[i],nums[left],nums[right] });
				do {
					left++;
				} while (left < right && nums[left] == nums[left - 1]);
				do {
					right--;
				} while (left < right && nums[right] == nums[right + 1]);
			}
		}
	}
	return ret;
}
};

