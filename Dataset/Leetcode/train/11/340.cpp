class Solution {
public:
	//求max(min(h[i],h[j])*(j-i),i=0...n,j=i...n)
	int XXX(vector<int>& height) {
		int ans{}, tmp;
		for (int i{}, j = height.size() - 1; i <= j; ) {
			if (height[i] > height[j]) {
				tmp = height[j] * (j - i);
				j--;
			}
			else {
				tmp = height[i] * (j - i);
				i++;
			}
			ans = ans > tmp ? ans : tmp;
		}
		return ans;
	}
};

