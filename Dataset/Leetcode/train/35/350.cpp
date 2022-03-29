 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
		int len = nums.size();
		for(int i = 0; i < len; i++) {
			int n = nums.at(i);
			if(target<=n) {
				return i;
			}
		}
		return len;
    }
};

