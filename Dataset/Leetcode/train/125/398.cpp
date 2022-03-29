 class Solution {
public:
    bool XXX(string s) {
        // remove all non-alphanumeric characters
        s.erase(remove_if(s.begin(), s.end(), [](char c) { return !isalnum(c); }),
            s.end());
        // convert to lower case
        for (int i = 0; i < s.size(); ++i) {
            s[i] = tolower(s[i]);
        }

        // reverse the string and compare
        string s_r (s.rbegin(), s.rend());

        return (s.compare(s_r) == 0);
    }
};

