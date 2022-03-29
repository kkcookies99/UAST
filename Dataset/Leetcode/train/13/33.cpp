class Solution {
public:
	int XXX(string s) {
		int r = 0, i;
		for (i = 0; i < s.length(); i++) {
			switch(s[i]) {
			case 'I':r += ('V' == s[i + 1] || 'X' == s[i + 1]) ? -1 : 1;	break;
			case 'V':r += 5;	break;
			case 'X':r += ('L' == s[i + 1] || 'C' == s[i + 1]) ? -10 : 10;	break;
			case 'L':r += 50;	break;
			case 'C':r += ('D' == s[i + 1] || 'M' == s[i + 1]) ? -100 : 100;	break;
			case 'D':r += 500;	break;
			case 'M':r += 1000;	break;
			}
		}
		return r;
	}
};

