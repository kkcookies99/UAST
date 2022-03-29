class Solution {
public:
	int XXX(string str) {
		int i = 0;//位置
		long long res = 0;//输出结果
		int bol = 1;//符号
		while (i < str.size() && str[i] == ' ')++i;//找到第一个非空格的字符
		if (i == str.size())return 0;
		if (str[i] == '-') { bol = -1; ++i; }//运算符正负号
		else if (str[i] == '+') { bol = 1; ++i; }
		while (i < str.size() && str[i] >= '0' && str[i] <= '9') {
			res = res * 10 + str[i++] - '0';
			if (res >= 2147483648) {
				if (bol == 1)return INT_MAX;
				else return INT_MIN;
			}
		}
		return res * bol;
	}
};

