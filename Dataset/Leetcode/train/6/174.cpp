 class Solution {
public:
	string XXX(string s, int numRows) {
		int x = 0,n = 0;
		string ret;
		vector<string> z(numRows);
		while (1) {
			x = 0;
			while (x < numRows&&n<s.size())
				z[x++].push_back(s[n++]);
			x--;
			while (x > 1 && n < s.size())
				z[--x].push_back(s[n++]);
			if (n == s.size()) break;
		}
		for (int k = 0; k < numRows; k++)
			ret += z[k];
		return ret;

	}
};

