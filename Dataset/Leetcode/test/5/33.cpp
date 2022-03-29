 class Solution {
public:
    string XXX(string s) {
        for(int len = s.size(); len >= 1; len --)
        {
            for(int l = 0; l + len - 1 < s.size(); l ++)
            {
                int r = l + len - 1, i, j;
                for(i = l, j = r; i < j; i ++, j --)
                    if(s[i] != s[j]) break;

                if(i >= j)
                    return s.substr(l, len);
            }
        }

    }
};

