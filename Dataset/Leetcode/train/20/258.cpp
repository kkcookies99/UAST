 class Solution {
public:
    bool XXX(string s) {
	map<char, int>mymap;
	mymap['('] = 0;
	mymap['{'] = 1;
	mymap['['] = 2;
	mymap[')'] = 3;
	mymap['}'] = 4;
	mymap[']'] = 5;
	stack<char>mys;
	for (int i = 0; i < s.size(); i++)
	{
		if (isspace(s[i]))
			continue;
		if (mymap[s[i]] <= 2)
			mys.push(s[i]);
        else if(mys.empty()&&mymap[s[i]] >2)
            return false;
		else if (!mys.empty() && (mymap[s[i]] - mymap[mys.top()] != 3))
			return false;
		else
			mys.pop();
	}
	return mys.empty();
}
};

