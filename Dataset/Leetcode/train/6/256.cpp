 class Solution {
public:
	string XXX(string s, int numRows) {
		if (numRows < 2) {
			return s;
		}
		int n = s.size();
		string res = "";
		int count = 2 * numRows - 2;
		for (int j = 0; j < numRows; j++) {
			if (j == 0 || j == numRows - 1) {
				for (int i = j; i < n; i = i + count) {
					res += s[i];
				}
			}
			else {
				for (int i = j; i < n; i = i + count) {
					res += s[i];
					if ((i + count - j * 2) < n) {
						res += s[i + count - j * 2];
					}
				}
			}
		}
		return res;
	}
};

