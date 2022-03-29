 class Solution {
public:
    int isPalindrome(string s, int first, int second)
    {
        int len = 0;
        bool flag = (first == second);
        while(first >= 0 && second < s.length())
        {
            if(s[first] == s[second])
            {
                len += 2;
                first--;
                second++;
            }
            else
                break;
        }
        if(flag && len)
            return len - 1;
        return len;
    }
    string XXX(string s) {
        if(s.length() == 1)
            return s;
        int maxlen = 0, start = 0;
        for(int i = 0; i < s.length()-1; i++)
        {
            int odd = isPalindrome(s, i, i);
            int even = isPalindrome(s, i , i+1);
            int maxx = max(odd, even);
            if(maxlen < maxx)
            {
                maxlen = maxx;
                start = i - (maxlen - 1) / 2;
            }
        }
        return s.substr(start, maxlen);
    }
};

