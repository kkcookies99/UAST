 class Solution {
public:
	int singleNumber(vector<int>& nums) {
		sort(nums.begin(), nums.end());

		for (int i = nums.size() - 1; i > 0; i--) {
			if (nums[i] != nums[i - 1])
				return nums[i];
			else {
				nums.pop_back();
				nums.pop_back();
				i--;
			}
		}
		return nums[0];
	}
};

