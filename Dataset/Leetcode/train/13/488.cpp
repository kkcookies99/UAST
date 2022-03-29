 class Solution {
public:
	int XXX(string s) {
		int ans{}, tmp, len = s.size() - 1;
		for (int i = len; i >= 0; --i)
		{
			switch (s[i])
			{
			case 'I':ans += i == len ? 1 : tmp > 1 ? -1 : 1; tmp = 1; break;
			case 'X':ans += i == len ? 10 : tmp > 10 ? -10 : 10; tmp = 10; break;
			case 'C':ans += i == len ? 100 : tmp > 100 ? -100 : 100; tmp = 100; break;
			case 'V':ans += tmp = 5; break;
			case 'L':ans += tmp = 50; break;
			case 'D':ans += tmp = 500; break;
			case 'M':ans += tmp = 1000; break;
			}
		}
		return ans;
	}
};

