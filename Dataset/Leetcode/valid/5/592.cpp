 class Solution {
public:
	string XXX(string s) {
		int len = s.size(),beg=0,end=0;
		for (int i = 1; i < len; ++i) {
			//奇数子串
			int a = i, b = i;
			while (a >= 0 && b < len&&s[a] == s[b]) {
				--a; ++b;
			}
			++a; --b;
			if (b - a + 1 > end - beg + 1) {
				beg = a; end = b;
			}
			//偶数子串
			a = i-1, b = i;
			while (a >= 0 && b < len&&s[a] == s[b]) {
				--a; ++b;
			}
			++a; --b;
			if (b - a + 1 > end - beg + 1) {
				beg = a; end = b;
			}
		}
		return s.substr(beg, end - beg + 1);
	}
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


