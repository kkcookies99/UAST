 class Solution {
public:
	string fun(string s)
	{
		int p = 0, q = 0;
		int count = 0;
		string ret;
		while (q != s.size())
		{
			if (s[p] == s[q])
			{
				q++;
			}
			else if (s[p] != s[q])
			{
				count = q - p;
				ret += '0'+count;
				ret += s[p];
				p = q;
			}
		}
		if (s[p] == s[q - 1])
		{
			count = q - p;
			ret += '0' + count;
			ret += s[p];
		}
		return ret;
	}
	string XXX(int n) {
		vector<string> v;
		v.push_back("1");
		for (int i = 0; i <n; i++)
		{
			string tmp = fun(v[i]);
			v.push_back(tmp);
		}
		return v[n - 1];
	}
};

