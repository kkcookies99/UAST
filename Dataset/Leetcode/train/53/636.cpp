 class Solution {
public:
	int XXX(vector<int>& nums) {
		int r = nums[0], tmp;
		for (int i = 0; i < nums.size(); i++) {
            tmp = 0;
			for (int j = i; j < nums.size(); j++) {
				tmp += nums[j];
				if (tmp > r)	r = tmp;
			}
		}
		return r;
	}
};

