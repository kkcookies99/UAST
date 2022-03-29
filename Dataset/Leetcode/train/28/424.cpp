 class Solution {
public:
    int XXX(string haystack, string needle) {
               if (needle == "")
	{
		return 0;
	}
	if (haystack.size() < needle.size())
	{
		return -1;
	}
	for (int i = 0; i < haystack.size()-needle.size()+1; i++)
	{
		if (haystack[i] == needle[0])
		{
			int left = i;
			int right = 0;
			while (haystack[left] == needle[right])
			{
				left++;
				right++;
				if (left == haystack.size() || right == needle.size())
					break;
			}
			if (right == needle.size() )
			{
				return i;
			}

		}
	}
	return -1;
    }
};

