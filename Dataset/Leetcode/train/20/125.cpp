 class Solution {
public:
    bool XXX(string s)
    {
		if (s.empty())return true;
		for (int i = 0; i != s.length(); i++)
			for (int j = 0;; j++) {
				if (j == 3)return false;
				if (s[i] == c_left[j])
					if (s[i + 1] == c_right[j]) {
						s.erase(i, 2);
						return XXX(s);
					}
					else	break;
			}
		return false;
    }
    char c_right[3]  = { ')',']','}' };
    char c_left[3] = { '(','[','{' };
};

