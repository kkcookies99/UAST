class Solution {
public:
    int XXX(string str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            if (str[i] == ' ')
                continue;
            if (str[i] != '+' && str[i] != '-' && !is_dig(str[i]))
                return 0;

            bool negative;
            long long cnt = 0;
            if (str[i] == '+')
            {
                negative = false;
                i++;
            }
            else if (str[i] == '-')
            {
                negative = true;
                i++;
            }
            else
                negative = false;

            for (int j = i; j < str.length(); j++)
            {
                if (!is_dig(str[j]))
                    break;
                cnt = cnt * 10 + str[j] - '0';
                if (cnt > (long long)INT_MAX + 1)
                    return negative ? INT_MIN : INT_MAX;
            }
            if (!negative && cnt == (long long)INT_MAX + 1)
                return INT_MAX;
            return negative ? -cnt : cnt;
        }
        return 0;
    }
    inline bool is_dig(char t)
    {
        return t >= '0' && t <= '9';
    }
};

