 class Solution {
public:
    string XXX(string s, int numRows) {
        if (numRows <= 1) return s;

		int len = s.length();
		string ans(len , 0);
		
		int ans_idx = 0;
		for (int row = 0; row < numRows; row++) {
			if (row == 0 || row == (numRows - 1)) {
				int i = row;
				while (i < len) {
					ans[ans_idx++] = s[i];
					i += numRows * 2 - 2;
				}	
			}
			else {
				int i = row;
				int idx_1 = ans_idx;
				int idx_2 = ans_idx + 1;
				while (i < len) {
					ans[idx_1] = s[i];
					idx_1++; idx_1++;
					i += numRows * 2 - 2;
				}

				i = row;
				i = (numRows * 2 - 2 - i);
				while (i < len) {
					ans[idx_2] = s[i];
					idx_2++; idx_2++;
					i += numRows * 2 - 2;
				}

				ans_idx = idx_1 < idx_2 ? (idx_2 - 2) : (idx_1 - 2);
				ans_idx++;
			}
		}

		return ans;
    }
};

