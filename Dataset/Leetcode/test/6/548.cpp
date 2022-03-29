 class Solution {
public:
	string XXX(string s, int numRows) {
		int k = numRows == 1 ? 1 : (2 * numRows - 2);
		int n = s.length();
		string str = "";
		int t = 0;
		while (t < numRows) {
			int tmp = t;
			while (tmp < n) {
				str += s[tmp];
				if ((tmp % k) != 0 && (tmp % k) != (numRows - 1) && tmp + 2 * ((numRows - 1) - (tmp % k)) < n) {
					str += s[tmp + 2 * ((numRows - 1) - (tmp % k))];
				}
				tmp += k;
			}
			++t;
		}
		return str;
	}
};

