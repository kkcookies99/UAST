 class Solution {
public:
	vector<vector<int>> XXX(vector<int>& nums) {
		if (nums.size() < 3){
			return{};
		}
		vector<vector<int>> ans;
		vector<int> vi;
		sort(nums.begin(), nums.end());
		for (int i = 0; i < nums.size()-2; i++){
			if (i>0 && nums[i] == nums[i - 1])
				continue;
			int target = 0 - nums[i];
			int start = i + 1, end = nums.size() - 1;
			while (start < end){
				int cur = nums[start] + nums[end];
				if (cur < target){
					start++;
				}
				else if (cur>target){
					end--;
				}
				else{
					vi = { nums[i], nums[start], nums[end] };
					ans.push_back(vi);
					start++;
					while (start < end&&nums[start] == nums[start - 1]){
						start++;
					}
					end--;
					while (start < end&&nums[end] == nums[end + 1]){
						end--;
					}
				}
			}
		}
		return ans;
	}
};

