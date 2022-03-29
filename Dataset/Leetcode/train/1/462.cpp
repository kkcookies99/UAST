 class Solution {
public:  
vector<int> XXX(vector<int>& nums, int target) {
	vector<int> result;
	for (int i = 0; i < nums.size(); ++i) {
		int surplus = target - nums[i];
		for (int j = i + 1; j < nums.size(); ++j) {
			if (surplus == nums[j]) {
				result.push_back(i);
				result.push_back(j);
				return result;
			}
		}
	}
    	return result;
}
};


