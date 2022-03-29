 class Solution {
public:
	bool XXX(string s) {
		int len = s.length();
		string str;
		bool result = false;
		for (int i = 0; i < len; ++i) {
			if (isalnum(s[i]) || isalpha(s[i])) {
				str += tolower(s[i]);
			}
		}
		string str2 = str;
		reverse(str.begin(), str.end());
		if (str2 == str) {
			result = true;
		}
		return result;
	}
};

