 class Solution {
public:
	string XXX(string s, int numRows) {
		if (numRows == 1) return s;
		vector<string> s_temp(numRows);
		string ans;
		bool f = false;
		int k = 0;
		for (int i = 0; i < s.length(); i++) {
			s_temp[k].push_back(s[i]);
			f = k == 0 || k == numRows - 1 ? !f : f;
			f ? ++k : --k;
		}
		for (int i = 0; i < numRows; i++) 
			ans += s_temp[i];
		return ans;
	}
};

