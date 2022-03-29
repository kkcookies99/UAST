 class Solution {
public:
    string XXX(string s, int numRows) {
     string t=s;int b=0;
     if(s.length()<2||numRows==1) return t;
     else
     {
     for(int i=1;i<=numRows;i++)
     {
         if(i==1||i==numRows)
         {
             int k=i-1;
             while(k<s.length())
             {
              t[b]=s[k];k=k+2*(numRows-1);b++;
             }
         }
         else
         {
              int k=i-1,h=2*(i-1);;
              t[b]=s[k];k=k+2*(numRows-1);b++;
             while(1)
             {
                 if(k-h>=s.length()) break;
                 t[b]=s[k-h];b++;
                 if(k>=s.length()) break;
                 t[b]=s[k];k=k+2*(numRows-1);b++;
             }
         }
     }
     return t;
     }
    }
};

