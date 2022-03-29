 int XXX(string s)
{
	int l = 0, r = l, _max = 0;
	set<char> sc;
	while (r != s.size())
	{
		if (sc.find(s[r]) == sc.end())//没找到
		{
			sc.insert(s[r++]);
			_max = max(_max, r - l);
		}
		else sc.erase(s[l++]);
	}
	return _max;
}

