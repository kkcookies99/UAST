 class Solution
{
public:
    int XXX(string s)
    {
        int a[95];
        memset(a, 0, sizeof(int)*95);
        int size = s.size();
        int res = 0;
        int lens = 0;
        int i = 0;

        while (i<size) {
            if (a[s[i] - ' '] == 1)
            {
                res = lens>res ? lens : res;
                memset(a, 0, sizeof(int) * 95);
                i -= lens - 1;
                lens = 0;
            }
            else {
                a[s[i] - ' '] = 1;
                lens++;
                ++i;
            }
        }
        res = lens > res ? lens : res;
        return res;
    }
};

