 class Solution {
public:
	bool XXX(string str) {
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			while (!isalnum(str[i]) && i < j) i++;//从左往右遍历字符串定位字母字符下标
			while (!isalnum(str[j]) && j > i) j--;//从右往左遍历字符串定位字母字符下标
			if ((str[i]&=0xdf) != (str[j]&=0xdf)) return false;//无匹配字符
		}
		return true;
	}
};

