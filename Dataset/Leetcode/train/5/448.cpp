 class Solution {
public:

    int check_huiwen_length(string& s, int l, int m)
    {
        int lens = 0;
        if (l == m)
        {
            lens = 1;
            l--;
            m++;
        }
        while (l >= 0 && m < s.length() && s[l] == s[m])
        {
            lens += 2;
            l--;
            m++;
        }
        return lens;
    }

    string XXX(string s) {
        int n = s.size();
        if (n < 2) {
            return s;
        }

        int maxLen(1), localLen(1), begin(0);
        for(int i=1; i<n;i++)
        {
            localLen = max(check_huiwen_length(s, i, i), check_huiwen_length(s, i-1, i));
            if(localLen > maxLen)
            {
                maxLen = localLen;
                begin = i-localLen/2;
                if (i + localLen / 2>n)
                {
                    break;
                }
            }
        }
        return s.substr(begin, maxLen);
    }
};

