class Solution {
public:
    int XXX(string s) {
        int n=s.size();
        int res = 0;
        int i=0;
        for(;i<n-1;++i)
        {
            int num = 0;
            switch(s[i])
            {
                case 'I':
                {
                    if(s[i+1]=='V')
                    {
                        num = 4;
                        ++i;
                    }
                    else if(s[i+1]=='X')
                    {
                        num = 9;
                        ++i;
                    }
                    else
                        num = 1;
                    break;
                }
                case 'X':
                {
                    if(s[i+1]=='L')
                    {
                        num = 40;
                        ++i;
                    }
                    else if(s[i+1]=='C')
                    {
                        num = 90;
                        ++i;
                    }
                    else num=10;
                    break;
                }
                case 'C':
                {
                    if(s[i+1]=='D')
                    {
                        num=400;
                        ++i;
                    }
                    else if(s[i+1]=='M')
                    {
                        num=900;
                        ++i;
                    }
                    else num = 100;
                    break;
                }
                case 'V':
                {
                    num = 5;
                    break;
                }
                case 'L':
                {
                    num = 50;
                    break;
                }
                case 'D':
                {
                    num = 500;
                    break;
                }
                case 'M':
                {
                    num = 1000;
                    break;
                }
            }
            res +=num;
        }
        if(i==n) return res;
        else
        {
            if(s[i]=='I') return res+1;
            if(s[i] =='V') return res+5;
            if(s[i]=='X') return res+10;
            if(s[i]=='L') return res+50;
            if(s[i]=='C') return res+100;
            if(s[i]=='D') return res+500;
            return res+1000;
        }
    }
};

