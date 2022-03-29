 class Solution {
public:
    string XXX(string a, string b) {
       int i=a.length()-1,j=b.length()-1;
       int f=0;string res="";
       while(i>=0&&j>=0)
       {
           if((a.at(i)+b.at(j)-'0'-'0'+f)==0)
           {
               res="0"+res;
               f=0;
           }
           else if((a.at(i)+b.at(j)-'0'-'0'+f)==1)
           {
               res="1"+res;
               f=0;
           }
           else if((a.at(i)+b.at(j)-'0'-'0'+f)==2)
           {
               res="0"+res;
               f=1;
           }
           else
           {
               res="1"+res;
               f=1;
           }
           i--;j--;
       }
       while(i>=0)
       {
           if(a.at(i)-'0'+f==0)
           {
                res="0"+res;
               f=0;
           }
           else if(a.at(i)-'0'+f==1)
           {
               res="1"+res;
               f=0;
           }
           else if(a.at(i)-'0'+f==2)
           {
               res="0"+res;
               f=1;
           }
           else
           {
               res="1"+res;
               f=1;
           }
           
           i--;
       }
       while(j>=0)
       {
           if(b.at(j)-'0'+f==0)
           {
               res="0"+res;
               f=0;
           }
           else if(b.at(j)-'0'+f==1)
           {
               res="1"+res;
               f=0;
           }
           else if(b.at(j)-'0'+f==2)
           {
               res="0"+res;
               f=1;
           }
           else
           {
               res="1"+res;
               f=1;
           }
           j--;
       }
       if(f)
       {
           res="1"+res;
       }
       return res;
    }
};

