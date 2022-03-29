class Solution {
public:
    int XXX(string s) {
		bool bPositive = true;
		bool bStart = false;
		int nRes = 0;
		int nLen = s.length();
		for (int i = 0; i < nLen; ++i)
		{
			if (!bStart && s[i] == ' ')
				continue;

			if (s[i] < '0' || s[i] > '9')
			{
				if (bStart)
				{
					break;
				}

				if (s[i] == '-')
				{
					bPositive = false;
					bStart = true;
					continue;
				}
				else if (s[i] == '+')
				{
					bPositive = true;
					bStart = true;
					continue;
				}
				else
				{
					break;
				}
			}
			int nDiff = (s[i] - '0');

			bStart = true;

			//正数，防止超过上限
			if (bPositive && INT_MAX / 10.0 < nRes + nDiff / 10.0)
			{
				return INT_MAX;
			}
			else if (!bPositive && INT_MIN / 10.0 > nRes - nDiff / 10.0)
			{
				//负数，防止超过下限
				return INT_MIN;
			}

			nRes = nRes * 10 +  (bPositive ? nDiff : -nDiff);
		}

		return nRes;
    }
};

