 class Solution {
public:
	int XXX(vector<int>& height) {
		int L = 0, R = height.size() - 1, best = 0;
		while (L < R) {
			best = max(best, min(height[L], height[R]) * (R - L));
			height[L] <= height[R] ? L++ : R--;
		}
		return best;
	}
};

