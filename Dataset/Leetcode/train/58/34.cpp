 class Solution {
public:
    int XXX(string s) {
        if (s.empty()) return 0;
        bool begin = false;
        int res = 0;
        for(int i = s.size() - 1; i >= 0; i--)
        {
            if (s[i] == ' ')
            {
                if (!begin) continue;
                break;
            }

            if ((s[i] >= 'A' && s[i] <= 'Z') || (s[i] >= 'a' && s[i] <= 'z'))
            {
                begin = true;
                res++;
            }
            else
            {
                begin = false;
                res = 0;
            }

        }
        return res;
    }
};

