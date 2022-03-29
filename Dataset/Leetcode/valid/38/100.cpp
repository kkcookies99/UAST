class Solution {
public:
    string XXX(int n) {
        string s = "1";
        for (int i=0; i<n-1; i++) {
            s = getDes(s);
        }
        return s;
    }

private:
    string getDes(string s)
    {
        string ans;
        for (int i = 0; i < s.size(); i++) {
            int count = 1;
            int j;
            for (j = i + 1; j < s.size(); j++) {
                if (s[j] != s[i]) {
                    break;
                }
                count++;
            }
            ans += (count + '0');
            ans += s[i];
            i = j - 1;
            if (j == s.size()) break;
        }
        return ans;
    }
};