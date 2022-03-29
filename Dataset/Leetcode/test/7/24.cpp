class Solution {
public:
    int XXX(int x)
    {
        int sym = 0;
        string t = to_string(x);
        if(x<0)
        {
            t = t.substr(1);
            sym = 1;
        }
        int XXX_x = 0;
        for(int i=t.size()-1;i>=0;i--)
        {
            if(XXX_x>INT_MAX/10)
                return 0;
            else if(XXX_x==INT_MAX/10)
            {
                if(sym==1&&t[i]-'0'>8)
                    return 0;
                else if(sym==0&&t[i]-'0'>7)
                    return 0;
            }
            XXX_x *= 10;
            XXX_x += t[i]-'0';
        }
        return sym==1?-XXX_x:XXX_x;
    }
};

