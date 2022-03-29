 class Solution {
public:
	int XXX(vector<int>& height) {
		int l = 0, r = height.size() - 1;
		int res = min(height[l], height[r]) * (r - l);
		while (l < r) {
			if (height[l] <= height[r]) {
				++l;
			}
			else {
				--r;
			}
			res = max(res, min(height[l], height[r]) * (r - l));
		}
		return res;
	}
};

