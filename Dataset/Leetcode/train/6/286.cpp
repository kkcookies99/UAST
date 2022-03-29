 class Solution {
public:
    string XXX(string s, int numRows) {
        string result;
	if (s.size() <= numRows||numRows == 1) {
		return s;
	}
	else {
		for (int i = 0; i < numRows; i++) {
			int k = 0;
			int d = i;
			while (1) {
				if (i == 0||i == numRows-1) {
					d = i+(2 * numRows - 2)*k;
				}
				else {
					if (k % 2 == 0&& k!=0 ) {
						d = d + 2 * i;
					}
					if (k % 2 == 1 && k != 0) {
						d = (d + ((2 * numRows - 2) - 2 * i));
					}
				}
				if (d < s.size()) {
					result += s[d];
				}
				else {
					break;
				}
				k++;
			}
		}
		return result;
	}
    }
};

