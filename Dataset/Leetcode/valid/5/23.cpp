 class Solution {
public:
    string XXX(string s) {
       if (s == "")return "";
	int len = s.length();
	int index = 0,maxL=0,begin=0;
	while (index < len) {
		int right = index, left = index;
		while (index < len&&s[index + 1] == s[index]) {
			index++;
			right++;
		}
		while (right < len&&left >= 0 && s[right] == s[left]) {
			right++;
			left--;
		}
		right--, left++;
		if (right-left+ 1 > maxL) {
		maxL = right - left + 1;
		begin = left;
		}
		index++;
	}
	return s.substr(begin, maxL);
    }
};

