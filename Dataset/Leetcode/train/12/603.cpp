 class Solution {
public:
    string XXX(int num) {
        
        string str="";
        
        if(1000<=num && num<=3999)
        {
            int temp=num/1000;
            for(int i=0;i<temp;i++)
            {
                str+='M';
            }
        }
        num%=1000;
        
        if(900<=num && num<1000)
        {
            str+="CM";
        }
        else if(500<=num && num<900)
        {
            num-=500;
            str+='D';
            int temp=num/100;
            for(int i=0;i<temp;i++)
            {
                str+='C';
            }
        }
        else if(400<=num && num<500)
        {
            str+="CD";
        }
        else if(100<=num && num<400)
        {
            int temp=num/100;
            for(int i=0;i<temp;i++)
            {
                str+='C';
            }
        }
        num%=100;
        
        if(90<=num && num<100)
        {
            str+="XC";
        }
        else if(50<=num && num<90)
        {
            num-=50;
            str+='L';
            int temp=num/10;
            for(int i=0;i<temp;i++)
            {
                str+='X';
            }
        }
        else if(40<=num && num<50)
        {
            str+="XL";
        }
        else if(10<=num && num<40)
        {
            int temp=num/10;
            for(int i=0;i<temp;i++)
            {
                str+='X';
            }
        }
        num%=10;
        
        if(9<=num && num<10)
        {
            str+="IX";
        }
        else if(5<=num && num<9)
        {
            num-=5;
            str+='V';
            int temp=num;
            for(int i=0;i<temp;i++)
            {
                str+='I';
            }
        }
        else if(4<=num && num<5)
        {
            str+="IV";
        }
        else if(1<=num && num<4)
        {
            int temp=num;
            for(int i=0;i<temp;i++)
            {
                str+='I';
            }
        }
        
        return str;
    }
};

