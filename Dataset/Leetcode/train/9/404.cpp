 class Solution {
public:
    bool XXX(int x) 
    {
        if (x < 0)//负数全部排除
		{
			return false;
		}
		else if (0 <= x && x < 10)//1位数都是
		{
			return true;
		}
		else
		{
			string src, dest;
			while (x)//先将数字转换为字符
			{
				src += x % 10;
				x /= 10;
			}
			dest = src;//记录原字符
			reverse(src.begin(),src.end());//将其反转
			if (dest == src)//若源字符串和反转串不一致就不是回文串
			{
				return true;
			}
			return false;
		}
    }
};

