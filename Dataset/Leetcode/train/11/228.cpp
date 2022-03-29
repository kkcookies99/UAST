class Solution {
public:
    int XXX(vector<int>& height) {
	int result = 0;
	int left(0), right(height.size()-1);
	while (left != right) {
		result = max(result, min(height[left], height[right])*(right-left));
		height[left] >height[right] ? right-- : left++;
	}
        return result;
    }
};

