class Solution {
public:
    int XXX(string s) {
    if(s.find("IV")!=s.npos)
		s = s.replace(s.find("IV"),2,"a");
	if (s.find("IX") != s.npos)
		s = s.replace(s.find("IX"), 2, "b");
	if (s.find("XL") != s.npos)
		s = s.replace(s.find("XL"), 2, "c");
	if (s.find("XC") != s.npos)
		s = s.replace(s.find("XC"), 2, "d");
	if (s.find("CD") != s.npos)
		s = s.replace(s.find("CD"), 2, "e");
	if (s.find("CM") != s.npos)
		s = s.replace(s.find("CM"), 2, "f");
	int ans = 0;
	for (int i = 0; i < s.size(); i++) {
		switch (s[i]) {
		case 'I':
			ans += 1;
			break;
		case 'V':
			ans += 5;
			break;
		case 'X':
			ans += 10;
			break;
		case 'L':
			ans += 50;
			break;
		case 'C':
			ans += 100;
			break;
		case 'D':
			ans += 500;
			break;
		case 'M':
			ans += 1000;
			break;
		case 'a':
			ans += 4;
			break;
		case 'b':
			ans += 9;
			break;
		case 'c':
			ans += 40;
			break;
		case 'd':
			ans += 90;
			break;
		case 'e':
			ans += 400;
			break;
		case 'f':
			ans += 900;
			break;
		}
	}
	return ans;
    }  
};

