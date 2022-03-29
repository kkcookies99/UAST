class Solution {
public:
    int XXX(int x) {
        if (x == 0)return 0;
	double cur = x;
	double last = 0;
	while (abs(cur - last) >= 1) {
		last = cur;
		cur = (cur * cur + x) / (2 * cur);
	}
	return floor(cur);
    }
};

