 class Solution {
public:
int XXX(string s) {
	int iSize = s.size();
	if (iSize == 0) return 0;
	string sRes;
	char c;
	bool bPositive = true;
	bool bStart = false;
	long long lRes = 0;
	int i = 0;
	while (!bStart)  //判断是否开始
	{
		if (i >= iSize) break;
		c = s[i++];
		if (c == ' ') continue;
		else if (c == '-' || c == '+')
		{
			bPositive = c == '-' ? false : true;
			bStart = true;
		}
		else if (c >= '1' && c <= '9')
		{
			sRes += c;
			lRes = c - '0';
			bStart = true;
		}
		else if (c == '0')
		{
			bStart = true;
		}
		else break;
	}
	if (!bStart) return 0;  //到结尾都未开始，结束
	while (bStart)   //找到符合条件的字符，开始读取下面的字符
	{
		if (i >= iSize) break;
		c = s[i++];
		if (sRes == "" && c == '0') continue;
		if (c >= '0' && c <= '9')
		{
			sRes += c;
			lRes = lRes * 10 + c - '0';
			lRes = bPositive ? min(lRes, (long long)INT_MAX) : min(lRes, -(long long)INT_MIN); //防止long long溢出
		}
		else break;
	}
	if (sRes == "")
	{
		return 0;
	}
	if (!bPositive)
	{
		lRes *= -1;
	}
	return lRes;
}

};

