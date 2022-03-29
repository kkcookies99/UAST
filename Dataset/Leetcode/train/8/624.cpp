 class Solution {
public:
    int XXX(string s) {
        double i=0;
        int flag=0;
        for(auto c:s)
            if(c==' '&& !flag)continue;
        else if('0'<=c&&'9'>=c)
        {
           if(!flag)flag=1;
           i=i*10+flag*(c-'0');
        }
        else if((c=='+'||c=='-')&&!flag)
            if(c=='-')flag=-1;
            else flag=1;
        else
            break;
        i=i<int(0x7fffffff)?i:int(0x7fffffff);
        i=i>int(0x80000000)?i:int(0x80000000);
        return i;
    }
};

