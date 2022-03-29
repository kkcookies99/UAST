class Solution
{
public:
    string XXX(string s)
    {
        string reveS = s;
        reverse(reveS.begin(), reveS.end());
        int len = s.size();
        for (int trylen = len; trylen > 0; trylen--)
        {
            for (int i = 0; i + trylen <= len; i++)
            {
                if (s.find(reveS.substr(i, trylen)) == -1)
                    continue;
                else
                {
                    string tmp = reveS.substr(i, trylen);
                    reverse(tmp.begin(), tmp.end());
                    if (tmp == reveS.substr(i, trylen))
                        return reveS.substr(i, trylen);
                }
            }
        }
        return "";
    }
};

