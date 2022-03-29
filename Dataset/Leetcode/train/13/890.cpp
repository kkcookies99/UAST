 class Solution {
public:
    int XXX(string s)
    
    {
        int temp1=0;
        int temp=0;
        int sum =0;
         for(int i=0; i<s.length();i++)
         {
             switch(s[i])
             {
                 case 'I':
                 temp=1;
                 if(i<(s.length()-1)&&s[i+1]=='V')
                 {
                     temp=4;
                     i++;
                 }
                 if(i<(s.length()-1)&&s[i+1]=='X')
                 {
                     temp=9;
                     i++;
                 }
                 break;
                 case 'V':
                 temp=5;
                 break;
                 case 'X':
                  temp=10;
                  if(i<(s.length()-1)&&s[i+1]=='L')
                  {
                        temp=40;
                        i++;
                  }
                    if(i<(s.length()-1)&&s[i+1]=='C')
                  {
                        temp=90;
                        i++;
                  }
                 break;
                  case 'L':
                 temp=50;
                 break;
                 case 'C':
                 temp=100;
                   if(i<(s.length()-1)&&s[i+1]=='D')
                  {
                        temp=400;
                        i++;
                  }
                    if(i<(s.length()-1)&&s[i+1]=='M')
                  {
                        temp=900;
                        i++;
                  }
                 break;
                 case 'D':
                 temp=500;
                 break;
                 case 'M':
                 temp=1000;
                 break;
             }

            sum=sum+temp;

             
         }


                return sum;

    }
};

