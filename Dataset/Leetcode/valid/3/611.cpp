 class Solution {
public:
    int XXX(string s) {
        if (s.empty()) return 0;
    int i, max = 0, max1 = 0, sum = 0;
    char* a = new char[s.size()];
    for (i = 0; i < s.length(); i++)
        memcpy(a, s.c_str(), s.length());
    char* p1, * p2;
    p1 = p2 = a;
    int hashtable1[26] = { 0 };
    for (i = 0; i < 2 * s.length(); i++)
    {
        if (hashtable1[*p2 - 'a'] == 0)
        {
            hashtable1[*p2++ - 'a'] = 1;
            sum++; max1 = sum;
        }
        else
        {
            while (*p1 != *p2)
            {
                hashtable1[*p1 - 'a'] = 0;
                p1++; sum--;
            }
            hashtable1[*p1++ - 'a'] = 0;
            sum--;
        }
        if (max < max1)max = max1;
        if (p2 == nullptr)break;
    }
    return max;
    }
};


