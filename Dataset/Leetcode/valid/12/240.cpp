 class Solution {
public:
	stack<char>sta;

	char ch[7] = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
	void Roman(int rem, int time)
	{
		int i = 0;
		char ch1, ch5, ch10;
		switch (time)
		{
		case 1: {ch1 = ch[0]; ch5 = ch[1]; ch10 = ch[2]; break; }
		case 10: {ch1 = ch[2]; ch5 = ch[3]; ch10 = ch[4]; break; }
		case 100: {ch1 = ch[4]; ch5 = ch[5]; ch10 = ch[6]; break; }
		case 1000: {ch1 = ch[6]; break; }
		}
		if (rem < 4) for (i = rem; i > 0; i--) sta.emplace(ch1);
		else if (rem == 4) { sta.emplace(ch5), sta.emplace(ch1); }
		else if (rem < 9) { for (i = rem - 5; i > 0; i--) sta.emplace(ch1); sta.emplace(ch5); }
		else { sta.emplace(ch10); sta.emplace(ch1); }
	}

	string XXX(int num) {
		int time = 1, rem, res = num;

		while (res > 0)
		{
			res = res / 10;
			rem = num % 10;
			Roman(rem, time);
			num = num / 10;
			time = time * 10;
		}
		int i = 0, size = sta.size();
		string ans(size, 0);
		while (i < size)
		{
			ans[i++] = sta.top();
			sta.pop();
			//cout << ans[i];
		}
		
		return ans;
	}
};


