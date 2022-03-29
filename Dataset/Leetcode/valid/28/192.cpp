 class Solution {
public:
	int XXX(string haystack, string needle) {
		int m = haystack.size();
		int n = needle.size();
        if (n==0)
		{
			return 0;
		}
		vector<int>nextTable(n, 0);
		int t = nextTable[0] = -1;
		int i = 0;
		while (i < n-1)
		{
			if (t < 0 || needle[i] == needle[t])
			{
				++i;
				++t;
				nextTable[i] = (needle[i] != needle[t] ? t : nextTable[t]);
			}
			else
			{
				t = nextTable[t];
			}
		}
		int j = 0, k = 0;
		while (j < m && k < n)
		{
			if (k < 0 || haystack[j] == needle[k])
			{
				++k;
				++j;
			}
			else
			{
				k = nextTable[k];
			}
		}
		return (j - k<=m-n?j-k:-1);
	}
};

