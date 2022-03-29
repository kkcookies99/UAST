class Solution {
public:
    string XXX(int n) {
        string s = "1";
        string curr = "";
        int num = 1;
        for(int i = 2;i<=n;i++) {
            curr = "";
            for(int i=0,j=1;i<s.size();j++) {
                if(s[i] == s[j] && j<s.size()) {
                    num++;
                }
                else {
                    curr = curr + to_string(num) + s[i];
                    i = j;
                    num = 1;
                }
            }
            s = curr;
        }
        return s;
    }
};

