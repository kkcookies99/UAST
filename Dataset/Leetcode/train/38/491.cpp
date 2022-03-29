 class Solution {
public:
    string XXX(int n) {
        string s = "1";
        while(--n) {
            string t;
            for(int i=0; i<s.size();) {
                int k = i+1;
                while(k < s.size() && s[k] == s[i])k++;
                t += to_string(k-i) + s[i];
                i = k;
            }
            s = t;
        }
        return s;
    }
};


