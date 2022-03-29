class Solution {
public:
    int XXX(string str) {
        long long res = 0;
        int key = 1;
        int l = str.length();
        bool flag = false;
        for(int i=0; i<l; i++)
        {
            if(!flag)
            {
                if(str[i] == '+') flag = true;
                else if(str[i] == '-')
                {
                    flag = true;
                    key = -1;
                }
                else if(str[i] >= '0' && str[i] <= '9')
                {
                    flag = true;
                    res = 10 * res + str[i] - 48;
                }
                else if(str[i] == 32) ;
                else break;
            }
            else
            {
                if(!(str[i] >= '0' && str[i] <= '9')) break;
                else res = 10 * res + str[i] - 48;
                    
                if(key * res <= INT_MIN)
                {
                    res = -1 * INT_MIN;
                    break;
                }
                else if(key * res >= INT_MAX)
                {
                    res = INT_MAX;
                    break;
                }
            }
        }
        return key * res;
    }
};

