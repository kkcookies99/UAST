 class Solution {
public:
    int XXX(string s) {
        int ans=0;
        int i=0,j;
        while(i<s.length()){
            j=i+1;
            if(s[i]=='I'&&s[j]=='V'){
                ans+=4;
                i=j;
                i+=1;
                continue;
            }
            if(s[i]=='I'&&s[j]=='X'){
                ans+=9;
                i=j;
                i+=1;
                continue;
            }
            if(s[i]=='X'&&s[j]=='L'){
                ans+=40;
                i=j;
                i+=1;
                continue;
            }
            if(s[i]=='X'&&s[j]=='C'){
                ans+=90;
                i=j;
                i+=1;
                continue;
            }
            if(s[i]=='C'&&s[j]=='D'){
                ans+=400;
                i=j;
                i+=1;
                continue;
            }
            if(s[i]=='C'&&s[j]=='M'){
                ans+=900;
                i=j;
                i+=1;
                continue;
            }
            if((s[i]=='I'&&s[j]!='V')||(s[i]=='I'&&s[j]!='X'))
                ans+=1;
            if((s[i]=='X'&&s[j]!='L')||(s[i]=='X'&&s[j]!='C'))
                ans+=10;
            if((s[i]=='C'&&s[j]!='D')||(s[i]=='C'&&s[j]!='M'))
                ans+=100;
            if(s[i]=='V')
                ans+=5;
            if(s[i]=='L')
                ans+=50;
            if(s[i]=='D')
                ans+=500;  
            if(s[i]=='M')
                ans+=1000;                      
            i+=1;
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


