class Solution {
public:
	string XXX(string a, string b) {
		int carry = 0;
		string ans;
		int dif = a.size() - b.size();
		if (dif > 0)
		{
			b = string(dif, '0') + b;
		}
		else
		{
			a = string(-dif, '0') + a;
		}
		for (int i = a.size() - 1; i >= 0; i--)
		{
			int t;
			t = (a[i] - '0') + (b[i] - '0') + carry;
			if (t >= 2)
			{
				carry = 1 ;
			}
			else
			{
				carry = 0;
			}
			ans.insert(0, 1, t % 2 + '0');
			if (i == 0 && carry == 1)
			{
				ans.insert(0, 1, carry+'0');
			}
		}
		return ans;
	}
};

