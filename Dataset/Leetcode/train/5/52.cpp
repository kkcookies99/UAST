class Solution
{
public:
    string XXX(string s)
    {
        int len = s.size();
        for (int trylen = len; trylen > 0; trylen--)
        {
            for (int i = 0; i + trylen <= len; i++)
            {
                if (check(s, i, i + trylen - 1))
                    return s.substr(i, trylen);
                else
                    continue;
            }
        }
        return "";
    }

    bool check(string &s, int l, int r)
    {
        if (r - l > 1)
        {
            if (s[l] == s[r])
                return check(s, l + 1, r - 1);
            else
                return false;
        }
        else if (r - l == 1)
        {
            if (s[l] == s[r])
                return true;
            else
                return false;
        }
        else
            return true;
    }
};

