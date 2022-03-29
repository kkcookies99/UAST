class Solution {
public:
    int XXX(string s) 
    {
        if(s=="")
            return 0;
        int sum=0;
        int len=s.size();
        int i=0;
        while(i<len)
        {
            if(s.substr(i,2)=="IV")
            {
                sum=sum+4;
                i=i+2;
                continue;
            }
            if(s.substr(i,2)=="IX")
            {
                sum=sum+9;
                i=i+2;
                continue;
            }
            if(s.substr(i,2)=="XL")
            {
                sum=sum+40;
                i=i+2;
                continue;
            }
            if(s.substr(i,2)=="XC")
            {
                sum=sum+90;
                i=i+2;
                continue;
            }
            if(s.substr(i,2)=="CD")
            {
                sum=sum+400;
                i=i+2;
                continue;
            }
            if(s.substr(i,2)=="CM")
            {
                sum=sum+900;
                i=i+2;
                continue;
            }
            if(s.substr(i,1)=="I")
            {
                sum=sum+1;
                i=i+1;
                continue;
            }
            if(s.substr(i,1)=="V")
            {
                sum=sum+5;
                i=i+1;
                continue;
            }
            if(s.substr(i,1)=="X")
            {
                sum=sum+10;
                i=i+1;
                continue;
            }
            if(s.substr(i,1)=="L")
            {
                sum=sum+50;
                i=i+1;
                continue;
            }
            if(s.substr(i,1)=="C")
            {
                sum=sum+100;
                i=i+1;
                continue;
            }
            if(s.substr(i,1)=="D")
            {
                sum=sum+500;
                i=i+1;
                continue;
            }
            if(s.substr(i,1)=="M")
            {
                sum=sum+1000;
                i=i+1;
                continue;
            }

        }

       return sum; 
    }
};

