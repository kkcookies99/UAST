 class Solution {
public:
    string XXX(string s, int numRows) {
string New;

	int order;
	if (numRows>1)
	{
		order = 2 * numRows - 2;//计算一个z由几个数组成(一个z的周期)
	}
	else
	{
		order = 1;
	}
	int len = s.length();
	for (int i = 0; i < numRows; i++)//一共有几层
	{
		int j = i;//这一层从几开始
		int index = 0;
		while (j<len)//到字符串结束为止
		{
			New.append(1,s[j]);
			if (++index%2==0||i==numRows-1)
			{
				j += (order + i - j % order);//奇数时下一个为下一个周期减去当前层数
			}
			else
			{

				j += (order - i - j % order);//偶数时下一个为下一个周期加上当前层数
			}
		}

	}
	return New;
    }
};

