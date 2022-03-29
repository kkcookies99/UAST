 class Solution {
public:
	char check(char c) {
		if (c == ')') {
			return '(';
		}
		if (c == ']') {
			return '[';
		}
		if (c == '}') {
			return '{';
		}

		return '@';
	}

	bool XXX(string s) {
		int len = s.size();
		if (len < 2 || len & 1) {
			return false;
		}

		stack<char> stk;
		for (int i = 0; i < len; ++i) {
			char c = check(s[i]);
			if (c == '@') {
				stk.emplace(s[i]);
			}
			else {
				if (!stk.empty() && stk.top() == c) {
					stk.pop();
				}
				else {
					return false;
				}
			}
		}

		return stk.empty();
	}
};

