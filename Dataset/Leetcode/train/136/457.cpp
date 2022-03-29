 int singleNumber(vector<int>& nums) {
	sort(nums.begin(), nums.end());
	for (int i = 0, j = 1; j < nums.size(); ) {
		if (nums[i] != nums[j]) {
			return nums[i];
		}
		else {
			i += 2;
			j += 2;
		}
	}
	return nums[nums.size() - 1];
}

