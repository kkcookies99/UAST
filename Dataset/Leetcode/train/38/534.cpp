 class Solution {
public:
    string XXX(int n)
    {
        string s("1");
        string ns;
        char c;
        int i, j;

        while (--n)
        {
            c = s.front();
            i = j = 0;
            while (i != s.size())
            {
                if (s[i] != c)
                {
                    ns.push_back((char)(i - j + '0'));
                    ns.push_back(c);
                    c = s[i];
                    j = i;
                }
                ++i;
            }
            ns.push_back((char)(i - j + '0'));
            ns.push_back(c);
            swap(s, ns);
            ns.clear();
        }
        return s;
    }
};

