class Solution {
public:
    int convert(char s)
    {
        int result;
        if(s == 'I')
            result = 1;
        if(s == 'V')
            result = 5;
        if(s == 'X')
            result = 10;
        if(s == 'L')
            result = 50;
        if(s == 'C')
            result = 100;
        if(s == 'D')
            result = 500;
        if(s == 'M')
            result = 1000;
        return result;
    }
    int XXX(string s) {
        int len = s.size();
        int result = 0;
        for(int i=0;i<len;i++)
        {
            int add = 0;
            char tmp = s[i];
            if((tmp == 'I'||tmp == 'X'||tmp == 'C')&&(i!=len-1))
            {
                char next = s[i+1];
                if(tmp == 'I')
                {
                    if(next == 'V')
                        add = 4;
                    if(next == 'X')
                        add = 9;
                }
                else if(tmp == 'X')
                {
                    if(next == 'L')
                        add = 40;
                    if(next == 'C')
                        add = 90;
                }
                else if(tmp == 'C')
                {
                    if(next == 'D')
                        add = 400;
                    if(next == 'M')
                        add = 900;
                }
            }
            if(add!=0)
                i++;
            else 
                add = convert(tmp);
            result = result+add;
        }
        return result;
    }
};

