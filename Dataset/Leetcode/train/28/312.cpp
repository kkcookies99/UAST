 class Solution {
public:
	int XXX(string haystack, string needle) {
		int ans = -1;
		if (needle.empty()) return 0;
		int start = 0, end = start + needle.size() - 1;
		for (; end < haystack.size(); end++,start++) 
			if (haystack.substr(start, needle.size()) == needle) return start;
		return ans;
	}
};

