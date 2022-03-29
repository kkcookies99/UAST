class Solution {
public:
    bool XXX(int x) 
    {
        if(x <= 0 || x % 10 == 0)
            return false;
        int a,b,c,d,e;
        a = x/10000;
        b = (x-a*10000)/1000;
        c = (x-a*10000-b*1000)/100;
        d = (x-a*10000-b*1000-c*100)/10;
        e = x%10;
        if(a)
        {
            if(a == e && b == d)
                return true;
            else
                return false;
        }
        else if(b)
        {
            if(b == c && d == e)
                return true;
            else
                return false;
        }
        else if(c)
        {
            if(c == e)
                return true;
            else
                return false;
        }
        else if(d)
        {
            if(d == e)
                return true;
            else
                return false;
        }
    return 0;
    }
};

