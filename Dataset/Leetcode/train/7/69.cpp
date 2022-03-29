class Solution {
public:
    int XXX(int x) {
        long int result=0;
        bool flag=false;
        int min = 0x80000000;
        if(x==min)
        {
            return 0;
        }
        if(x<0)
        {
            x=-x;
            flag=true;
        }
        while (x)
        {
            result=result*10+x%10;
            x=(int)x/10;
        }
        if(flag)
        {
            result=-result;
        }
        if ((int)result!=result)
            return 0;
        else
        {
            return result;
        }
    }
};

