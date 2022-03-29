 class Solution {
public:
	string XXX(string s, int numRows) {
		int c = 2 * numRows - 2;
        if(c==0||s.length()<=numRows)return s;
		string result = "";
		for (int i = 0; i < numRows; i++) {
			if (s[i] != '0') {
				result += s[i];
				s[i] = '0';
			}
			for (int j = c - i; j < s.length(); j += c) {
					if (i != 0) {
						if (s[j] != '0') {
							result += s[j];
							s[j] = '0';
						}
						int temp = j + 2 * i;
                        if(temp<s.length())
						if (s[temp] != '0') {
							result += s[temp];
							s[temp] = '0';
						}
							
					}
					else {
                        if (s[j] != '0') {
							result += s[j];
							s[j] = '0';
						}
                    }
			}
		}
		return result;
	}
};

