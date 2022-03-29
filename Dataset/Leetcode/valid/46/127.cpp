class Solution {
private:
	vector<vector<int>>	res;
	void getans(int first, vector<int> nums) {
		if (first == nums.size() - 1)
		{
			res.push_back(nums);
			return;
		}
		for (int i = first; i < nums.size(); i++) {
			swap(nums[first],nums[i]);
			getans(first+1, nums);
			swap(nums[first], nums[i]);
		}
	}
public:
	vector<vector<int>> XXX(vector<int>& nums) {
		vector<int>	temp;
		getans(0, nums);
		return res;
	}
};

