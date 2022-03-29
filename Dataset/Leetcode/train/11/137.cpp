class Solution {
public:
    int XXX(vector<int>& height) {
	int l, w, area;
	int max = 0;
	for (int i = 0; i < height.size(); i++)
	{
		for (int j = i + 1;  j < height.size(); j++)
		{
			l = height[i] < height[j] ? height[i] : height[j];
			w = j - i;
			area = l * w;
			if (area > max)
				max = area;
		}
	}
	return max;
    }
};

