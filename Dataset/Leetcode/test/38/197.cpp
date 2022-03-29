class Solution {
public:
    string f(string s) {
        if(s=="") return "";
        int start = 0,pos = 0;
        string ans = "";
        while(pos<s.size()) {
            if(s[start]==s[pos]) {
                pos++;
            } else {
                ans += (char)(pos-start+'0');
                ans += s[start];
                start = pos;
            }
        }
        ans += (char)(pos-start+'0');
        ans += s[start];
        return ans;
    }
    string XXX(int n) {
        if(n==1) return "1";
        string s = XXX(n-1);
        return f(s);
    }
};

