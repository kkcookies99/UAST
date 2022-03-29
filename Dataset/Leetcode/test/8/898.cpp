 class Solution {
public:
    string Max = "2147483647";
    string Min = "2147483648";
    int XXX(string str) {
    if (str.size() == 0) return 0;
	int flag = 0;
	if (str[0] == ' ')
	{
		int cur = 0;
		while (str[cur] == ' ')
			cur++;
		str = str.substr(cur);
	}
	if (str[0] != '-' && str[0] != '+'&& !(str[0] >= '0' && str[0] <= '9'))
		return 0;
	if (str[0] == '-')
	{
		flag = 1;
		str = str.substr(1);
	}    
    else if (str[0] == '+')
	{
		str = str.substr(1);
	}
    if (str[0] == '0')
	{
		int cur = 0;
		while (str[cur] == '0')
			cur++;
		str = str.substr(cur);
	}
	int cur = 0;
	while (str[cur] >= '0' && str[cur] <= '9')
		cur++;
	str = str.substr(0, cur);
	if (str.size() >= 10 && flag == 0)
	{
		if (str.size() > 10)return INT_MAX;
		if (str.size() == 10 && str > Max)
			return 2147483647;			
	}
	if (str.size() >= 10 && flag == 1)
	{
		if (str.size() > 10)return INT_MIN;
		if (str.size() == 10 && str > Min)
			return 2147483647+1;
	}
	long long ret = 0;
	reverse(str.begin(), str.end());
	while (0 < str.size())
	{
		ret = ret * 10 + ((int)(str[str.size()-1] - '0'))%10;
		str.pop_back();
	}
	return flag == 1 ? -ret : ret;
    }
};

