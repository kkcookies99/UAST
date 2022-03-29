class Solution {
public:
	int XXX(int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}

		int a = 1, b = 2, c;
		n -= 2;
		while (n--) {
			c = a + b;
			a = b;
			b = c;
		}

		return c;
	}
};

