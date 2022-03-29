class Solution {
public:
    int XXX(string s) 
    {
        int i,sum=0,a,b=0;
        int n=s.length();
        for(i=0;i<n;i++)
        {
            switch(s[i])
            {
                case 'I':a=1;break;
                case 'V':a=5;break;
                case 'X':a=10;break;
                case 'L':a=50;break;
                case 'C':a=100;break;
                case 'D':a=500;break;
                case 'M':a=1000;break;
                default:return 0;
            }
                if(b<a)
                    b=-b;
                    sum=sum+b;
                    b=a;
        }
        sum=sum+b;
        return sum;
    }
};

