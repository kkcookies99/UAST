 class Solution {
public:
	string XXX(string s) {
		if (s == "" || s.size()== 1)
		{
			return s;
		}
		int size = s.size();
		int start = 0;
		int max = 1;
		int len1 = 0, len2 = 0;
		int len = 0;
		for (int i = 0; i < size; i++)
		{
			len1 = retRomeLen(s, i, i);
			len2 = retRomeLen(s, i, i + 1);
			len = len1>len2 ? len1 : len2;
			if (len > max)
			{	
				max = len;
				start = i - (len-1) / 2;
			}
		}
		
		return s.substr(start, max);
	}
	// 中心扩散的宽度
	int retRomeLen(string s, int left, int right)
	{
		while (left >= 0 && right < s.size() && s[left] == s[right] )
		{	
			left--;
			right++;
		}
		return right - left -1;
	}
};

