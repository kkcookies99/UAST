class Solution {
public:
    int XXX(string s) {
        int ans=0;
        int len=s.size();
        for(int i=0;i<len;i++)
        {
            if(s[i]=='I')
            {
                if(s[i+1]=='V')
                {
                    ans+=4;
                    i++;
                }
                else if(s[i+1]=='X')
                {
                    ans+=9;
                    i++;
                }
                else{
                    ans+=1;
                }
            }
            else if(s[i]=='V')
            {
                ans+=5;
            }
            else if(s[i]=='X')
            {
                if(s[i+1]=='L')
                {
                    ans+=40;
                    i++;
                }
                else if(s[i+1]=='C')
                {
                    ans+=90;
                    i++;
                }
                else{
                    ans+=10;
                }
            }
            else if(s[i]=='L')
            {
                ans+=50;
            }
            else if(s[i]=='C')
            {
                if(s[i+1]=='D')
                {
                    ans+=400;
                    i++;
                }
                else if(s[i+1]=='M')
                {
                    ans+=900;
                    i++;
                }
                else{
                    ans+=100;
                }

            }
            else if(s[i]=='D')
            {
                ans+=500;
            }
            else if(s[i]=='M')
            {
                ans+=1000;
            }
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

