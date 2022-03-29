 class Solution {
public:
    string XXX(int num) {
        string s;
        int i,k;
        if(num>0&&num<=10)
        { 
            if(num==10) return "X";
            s=convert(num,1);
        }
        else if(num>10&&num<=100)
        {
            if(num==100) return "C";
            s=convert(num/10,2);
            s+=convert(num%10,1);
        }
        else if(num>100&&num<=1000)
        {
            if(num==1000) return "M";
            s=convert(num/100,3);
            s+=convert((num%100)/10,2);
            s+=convert(num%10,1);
        }
        else
        {
            k=num/1000;
            s="M";
            for(i=1;i<k;i++)
            {
                s+="M";
            }
            k=num%1000;
            s+=convert(k/100,3);
            s+=convert((k%100)/10,2);
            s+=convert(k%10,1);
        }
        return s;
    }
    string convert(int num,int x)
    {
        string s,s1,s2,s3;
        int i;
        if(x==1)
        {
            s1="I";
            s2="V";
            s3="X";
        }
        else if(x==2)
        {
            s1="X";
            s2="L";
            s3="C";
        }
        else 
        {
            s1="C";
            s2="D";
            s3="M";
        }
        if(num>0&&num<=3)
        {
            s=s1;
            for(i=1;i<num;i++) s+=s1;
        }
        else if(num==4) s=s1+s2;
        else if(num==5) s=s2;
        else if(num>5&&num<9) 
        {
            s=s2;
            for(i=6;i<=num;i++) s+=s1;
        }
        else if(num==9) s=s1+s3;
        return s;
    }
};

