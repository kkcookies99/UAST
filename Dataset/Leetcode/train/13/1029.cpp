 class Solution {
public:
        int XXX(string s) {

		int i;
		int res;
		map<char, int> roma;
		
		roma['I'] = 1;
		roma['V'] = 5;
		roma['X'] = 10;
		roma['L'] = 50;
		roma['C'] = 100;
		roma['D'] = 500;
		roma['M'] = 1000;

		res = 0;
		for (i = 0; i < s.size(); i++)
		{
			res += roma[s[i]];
			if ((s[i] == 'V' || s[i] == 'X') && i > 0 && s[i - 1] == 'I')
				res -= 2;
			if ((s[i] == 'L' || s[i] == 'C') && i > 0 && s[i - 1] == 'X')
				res -= 20;
			if ((s[i] == 'D' || s[i] == 'M') && i > 0 && s[i - 1] == 'C')
				res -= 200;
		}
		return res;
	}
};

