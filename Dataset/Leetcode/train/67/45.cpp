 class Solution {
public:
    std::string XXX(std::string a, std::string b) {
        int size1 = a.size() - 1;
        int size2 = b.size() - 1;
        std::reverse(a.begin(), a.end());
        std::reverse(b.begin(), b.end());
        std::string s;
        int cf = 0;
        if (size1 > size2)
            s = a;
        else
            s = b;
        for(int i = 0; i < s.size(); ++i)
        {
            if(i > size1 || i > size2)
            {
                if(s[i] - '0' + cf == 2)
                {
                    cf = 1;
                    s[i] = '0';
                }
                else if(s[i] - '0' + cf == 1)
                {
                    cf = 0;
                    s[i] = '1';
                }
                else
                {
                    cf = 0;
                    s[i] = '0';
                }
                continue;
            }

            if((a[i] - '0') + (b[i] - '0') + cf == 2)
            {
                cf = 1;
                s[i] = '0';
            }
            else if((a[i] - '0') + (b[i] - '0') + cf == 1)
            {
                cf = 0;
                s[i] = '1';
            }
            else if((a[i] - '0') + (b[i] - '0') + cf == 0)
            {
                cf = 0;
                s[i] = '0';
            }
        }

        if(cf == 1)
            s.insert(s.end(),'1');
        
        std::reverse(s.begin(), s.end());

        return s;
    }
};

