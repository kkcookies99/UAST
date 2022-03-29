 class Solution {
public:
	bool XXX(string s) {
		int length = s.size();
		if (length == 0) { return true; }
		if (length % 2 == 1) { return false; }
		char c[10000];
		int index = 0;
		for (int i = 0; i < length; i++) {
			switch (s[i]) {
			case '[':
				if (i == length - 1) return false;
				c[index] = '[';
				index++;
				break;
			case'(':
				if (i == length - 1) return false;
				c[index] = '(';
				index++;
				break;
			case '{':
				if (i == length - 1) return false;
				c[index] = '{';
				index++;
				break;
			case ']':
				if (i == 0) return false;
				if (c[--index] != '[') {
					return false;
				}
				break;
			case ')':
				if (i == 0) return false;
				if (c[--index] != '(') {
					return false;
				}
				break;
			case '}':
				if (i == 0) return false;
				if (c[--index] != '{') {
					return false;
				}
				break;
			default:
				return false;
				break;
			}
		}
		return true;
	}
};

