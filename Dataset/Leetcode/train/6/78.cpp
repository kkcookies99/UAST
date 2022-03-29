 class Solution {
public:
	string XXX(string s, int numRows) {
		if (numRows == 1) return s;
		int t = numRows + numRows - 2;
		vector<string> res(numRows);
		for (auto i = 0; i < s.size(); i++) {
			int row = i % t > numRows - 1 ? t - i % t : i % t;
			res[row] += s[i];	
                }
		string ans;
		for (string str : res) {ans += str;}
		return ans;
	}
};