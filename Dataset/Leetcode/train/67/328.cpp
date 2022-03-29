 class Solution {
public:
	string XXX(string a, string b) {
		if (a == b && a == "0")return "0";
		if (a == "0")return b;
		if (b == "0")return a;
		int m = a.size(), n = b.size();
		bool flag = 0;
		string ans;
		string temp = m > n ? a : b;
		while (m && n)
		{
			ans.insert(0, 1, (a[--m] ^ b[--n] ^ flag) + '0');
			if (a[m] != b[n]&&flag == 1 )flag = 1;
			else if(a[m] == b[n] && a[m] == '1')flag = 1;
            else flag =0;
		}
		int pos = max(m, n);
		while(pos)
		{

			ans.insert(0, 1, (temp[--pos]^(flag + '0'))+'0');
			if(temp[pos] == '1')
                {if(flag == 1)flag =1;}
            else flag = 0;
		}
		if (flag)ans.insert(0, 1, '1');
		return ans;
	}
};

