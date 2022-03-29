class Solution {
public:
    int XXX(string s) {
        // remove space
        int pos = s.find_first_not_of(' ');
        if (pos == string::npos)
            return 0;
            
        bool positive = true;
        long ret = 0;

        long positiveBoundary = ((long)1 << 31) - 1;
        long negativeBoundary = ((long)1 << 31);

        if (s[pos] == '+') 
        {
            positive = true;
            pos++;
        }
        else if (s[pos] == '-') 
        {
            positive = false;
            pos++;
        }
        s = s.substr(pos, s.length());

        for(int i = 0; i < s.length(); ++i)
        {
            if (s[i] <'0' || s[i] > '9')
                break;   

            ret = ret * 10 + s[i] - '0';

            if (positive && (ret > positiveBoundary))
            {
                return positiveBoundary;
            }
            else if (!positive && (ret > negativeBoundary))
            {
                return (0 - negativeBoundary);
            }
        }

        if (positive) return ret;
        else return (0-ret);
    }
};

