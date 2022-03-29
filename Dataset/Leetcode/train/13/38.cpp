class Solution {
public:
    int XXX(string s) {
        int ans = 0;
        for (int i=0; i<s.size(); i++) {
            switch (s[i]) {
                case 'I':
                    if ('V' == s[i+1] || 'X' == s[i+1]) {
                        ans -= 1;
                    }
                    else {
                        ans += 1;
                    }
                    break;
                case 'V':
                    ans += 5;
                    break;
                case 'X':
                    if ('L' == s[i+1] || 'C' == s[i+1]) {
                        ans -= 10;
                    }
                    else {
                        ans += 10;
                    }
                    break;
                case 'L':
                    ans += 50;
                    break;
                case 'C':
                    if ('D' == s[i+1] || 'M' == s[i+1]) {
                        ans -= 100;
                    }
                    else {
                        ans += 100;
                    }
                    break;
                case 'D':
                    ans += 500;
                    break;
                case 'M':
                    ans += 1000;
                    break;
            }
        }
        return ans;
    }
};

