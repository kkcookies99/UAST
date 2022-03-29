 class Solution {
public:
    string a,b,c,result;
    string _XXX(const int& d,const int y)
    {
        result="";
        int i;
        switch(y)
        {
            case 10:{a="I";b="V";c="X";break;}
            case 100:{a="X";b="L";c="C";break;}
            case 1000:{a="C";b="D";c="M";break;}
            case 10000:
            {
                for(i=0;i<d;i++) result+="M";
                return result;
            }
            default:return "";
        }
        if(d<4) 
        {
            for(i=0;i<d;i++) result+=a;
        }
        else if(d==4) result=a+b;
        else if(d<9) 
        {
            result=b;
            for(i=0;i<d-5;i++) result+=a;
        }
        else result=a+c;
        return result;
    }
    string XXX(int num) {
        int a=num/1000,b=num%1000/100,c=num%100/10,d=num%10,i;//千，百，十，个
        string temp="";
        temp=_XXX(a,10000)+_XXX(b,1000)+_XXX(c,100)+_XXX(d,10);
        return temp;
    }
};

