 class Solution {
public:
    string XXX(vector<string>& strs) {
        if (strs.size() == 0) return "";
	
        string s = strs[0];
        for (int i = 1; i < strs.size(); i++)
            for (int j = 0; j < s.size(); j++)
                while (s[j] != strs[i][j]) {
                    s = s.substr(0, j);
                    break;
                }
        return s;
    }
};

