 class Solution {
public:
    string XXX(string s) {
        if (s.size() == 0)
            return "\0";
        int i, j;
        int max = 1;
        int temp;
        int k = 0;
        for (i = 0; i < s.size(); i++)
        {
            temp = 1;
            for (j = 1; j <= i; j++)  // 当为奇数的
            {
                if (j + i >= s.size())
                    break;
                else if (s[i - j] == s[i + j])
                    temp += 2;
                else
                {
                    break;
                }
            }
            if (temp > max)
            {
                max = temp;
                k = i - max / 2;
            }
            temp = 0;
            for (j = 0; j <= i; j++)
            {
                if (j + i + 1 >= s.size())
                    break;
                else if (s[i - j] == s[i + j + 1])
                    temp += 2;
                else{
                    break;
                }
            }
            if (temp > max)
            {
                max = temp;
                k =  i + 1 - max / 2;
            }
        }
        return s.substr(k, max);
    }
};

