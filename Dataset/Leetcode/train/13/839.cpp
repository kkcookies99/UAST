 class Solution {
public:
    int XXX(string s) {
        int i=0,v=0,x=0,l=0,c=0,d=0,m=0;
        int iv=0,ix=0,xl=0,xc=0,cd=0,cm=0;

        int n=s.size();

        for(int var=0;var<n;var++)
        {
            if(s[var]=='I') i++;
            if(s[var]=='V') v++;
            if(s[var]=='X') x++;
            if(s[var]=='L') l++;
            if(s[var]=='C') c++;
            if(s[var]=='D') d++;
            if(s[var]=='M') m++;

        }
        for(int var=0;var<n;var++)
        {
            if(s[var]=='I'&&s[var+1]=='V') 
            {
                i--;
                v--;
                iv++;
            }
            if(s[var]=='I'&&s[var+1]=='X') 
            {
                i--;
                x--;
                ix++;
            }
            if(s[var]=='X'&&s[var+1]=='L') 
            {
                x--;
                l--;
                xl++;
            }
            if(s[var]=='X'&&s[var+1]=='C') 
            {
                x--;
                c--;
                xc++;
            }
            if(s[var]=='C'&&s[var+1]=='D') 
            {
                c--;
                d--;
                cd++;
            }
            if(s[var]=='C'&&s[var+1]=='M') 
            {
                c--;
                m--;
                cm++;
            }
        }

        int number=i*1+v*5+x*10+l*50+c*100+d*500+m*1000+iv*4+ix*9+xl*40+xc*90+cd*400+cm*900;
        return number;
    }
};

