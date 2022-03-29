 class Solution {
public:
    string XXX(string s) {
        int reti=0,retj=0;
        string ret="";
        if(s.length()==0) return "";
        
        int judge[s.length()][s.length()];
        for(int m=0;m<s.length()-1;m++)
        {
                
            for(int n=0;n<s.length();n++)
            {
                if(m==n){judge[m][n]=1;if(reti==retj){reti=m;retj=m;}}
                else
                    {  
                   if(s[m]==s[m+1]){judge[m][m+1]=1;reti=m;retj=m+1;}
                   else{judge[m][n]=0;}
                    }
            }
        }
        judge[s.length()-1][s.length()-1]=1;
        if(reti==retj){reti=s.length()-1;retj=s.length()-1;}
        for(int l=3;l<=s.length();l++)
        {
            for(int i=0;i<=s.length()-l;i++)
            {
                if((s[i]==s[i+l-1])&&(judge[i+1][i+l-2]==1))
                {
                    judge[i][i+l-1]=1;
                    reti=i;retj=i+l-1;
                    
                }
            }
        }
  
      for(int k=reti;k<=retj;k++)
      {
          
          ret+=s[k];
      }
        return ret;
    }
};

