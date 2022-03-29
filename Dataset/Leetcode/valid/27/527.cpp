 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
		if(nums.size() == 0) return 0;
		int len = nums.size();
		for(int i = 0; i < len; i++) {
			int nowNum = nums.at(i);
			if(nowNum == val) {
				len --;
				nums.erase(nums.begin() + i);
				i--;
			}
		}
		return nums.size();
    }
};

